// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeContainerResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>D98A2895-745B-5530-A8C1-9A86F0A82354</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<DescribeContainerResourceResponseBodyResources> resources;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeContainerResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerResourceResponseBody self = new DescribeContainerResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeContainerResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContainerResourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeContainerResourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeContainerResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerResourceResponseBody setResources(java.util.List<DescribeContainerResourceResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeContainerResourceResponseBodyResources> getResources() {
        return this.resources;
    }

    public DescribeContainerResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContainerResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeContainerResourceResponseBodyResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cc-0005**********hhjw</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>c21b653f********695e892e718c419a4</p>
         */
        @NameInMap("ClusterIdentifier")
        public String clusterIdentifier;

        /**
         * <strong>example:</strong>
         * <p>a9ab843d-<strong><strong>-</strong></strong>-8e46-1d67a82128a7</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;pv_name&quot;:&quot;nas-a9ab843d-<strong><strong>-</strong></strong>-8e46-1d67a82128a7&quot;,&quot;pv_size&quot;:&quot;1000Gi&quot;,&quot;storage_class&quot;:&quot;opk8s-nas&quot;,&quot;pvc_name&quot;:&quot;**-pvc&quot;,&quot;namespace&quot;:&quot;default&quot;}</p>
         */
        @NameInMap("ResourceInfo")
        public String resourceInfo;

        /**
         * <strong>example:</strong>
         * <p>PV</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeContainerResourceResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerResourceResponseBodyResources self = new DescribeContainerResourceResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeContainerResourceResponseBodyResources setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerResourceResponseBodyResources setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }
        public String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        public DescribeContainerResourceResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeContainerResourceResponseBodyResources setResourceInfo(String resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public String getResourceInfo() {
            return this.resourceInfo;
        }

        public DescribeContainerResourceResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
