// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttachmentAttributesResponseBody extends TeaModel {
    /**
     * <p>Details about the private pools from which the instances are created.</p>
     */
    @NameInMap("Instances")
    public DescribeInstanceAttachmentAttributesResponseBodyInstances instances;

    /**
     * <p>The number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries that meet the query criteria.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeInstanceAttachmentAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeInstanceAttachmentAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the private pool. When the value of `PrivatePoolOptionsMatchCriteria` is `Open`, the private pool ID is the ID that was allocated by the system for automatic match.</p>
         */
        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        /**
         * <p>The match mode of the private pool. Valid values:</p>
         * <br>
         * <p>*   Open: Instances automatically match an open private pool.</p>
         * <p>*   Target: Instances match a specified private pool.</p>
         * <p>*   None: Instances do not use private pools.</p>
         */
        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        public static DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance self = new DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeInstanceAttachmentAttributesResponseBodyInstancesInstance setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
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
