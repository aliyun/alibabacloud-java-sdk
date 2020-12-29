// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttachmentAttributesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeInstanceAttachmentAttributesResponseBodyInstances instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeInstanceAttachmentAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttachmentAttributesResponseBody self = new DescribeInstanceAttachmentAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttachmentAttributesResponseBody setInstances(DescribeInstanceAttachmentAttributesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstanceAttachmentAttributesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstanceAttachmentAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAttachmentAttributesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAttachmentAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttachmentAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance self = new DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeInstanceAttachmentAttributesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance> instance;

        public static DescribeInstanceAttachmentAttributesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttachmentAttributesResponseBodyInstances self = new DescribeInstanceAttachmentAttributesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstances setInstance(java.util.List<DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
