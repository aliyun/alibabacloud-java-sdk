// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttachmentAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeInstanceAttachmentAttributesResponseInstances instances;

    public static DescribeInstanceAttachmentAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttachmentAttributesResponse self = new DescribeInstanceAttachmentAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttachmentAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttachmentAttributesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAttachmentAttributesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAttachmentAttributesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAttachmentAttributesResponse setInstances(DescribeInstanceAttachmentAttributesResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstanceAttachmentAttributesResponseInstances getInstances() {
        return this.instances;
    }

    public static class DescribeInstanceAttachmentAttributesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PrivatePoolOptionsId")
        @Validation(required = true)
        public String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        @Validation(required = true)
        public String privatePoolOptionsMatchCriteria;

        public static DescribeInstanceAttachmentAttributesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttachmentAttributesResponseInstancesInstance self = new DescribeInstanceAttachmentAttributesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttachmentAttributesResponseInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttachmentAttributesResponseInstancesInstance setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeInstanceAttachmentAttributesResponseInstancesInstance setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

    }

    public static class DescribeInstanceAttachmentAttributesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAttachmentAttributesResponseInstancesInstance> instance;

        public static DescribeInstanceAttachmentAttributesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttachmentAttributesResponseInstances self = new DescribeInstanceAttachmentAttributesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttachmentAttributesResponseInstances setInstance(java.util.List<DescribeInstanceAttachmentAttributesResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstanceAttachmentAttributesResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
