// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListProtectedResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>eyJJ************MX0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProtectedResources")
    public java.util.List<ListProtectedResourcesResponseBodyProtectedResources> protectedResources;

    /**
     * <strong>example:</strong>
     * <p>EB09****-<strong><strong>-</strong></strong>-****-********6C38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProtectedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedResourcesResponseBody self = new ListProtectedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProtectedResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProtectedResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProtectedResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProtectedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProtectedResourcesResponseBody setProtectedResources(java.util.List<ListProtectedResourcesResponseBodyProtectedResources> protectedResources) {
        this.protectedResources = protectedResources;
        return this;
    }
    public java.util.List<ListProtectedResourcesResponseBodyProtectedResources> getProtectedResources() {
        return this.protectedResources;
    }

    public ListProtectedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProtectedResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProtectedResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProtectedResourcesResponseBodyProtectedResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("CreatedByProduct")
        public String createdByProduct;

        /**
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <strong>example:</strong>
         * <p>pr-0004************gs61</p>
         */
        @NameInMap("ProtectedResourceId")
        public String protectedResourceId;

        /**
         * <strong>example:</strong>
         * <p>i-wz95************7zrd</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>1024********0703</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SnapshotCount")
        public Long snapshotCount;

        /**
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static ListProtectedResourcesResponseBodyProtectedResources build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedResourcesResponseBodyProtectedResources self = new ListProtectedResourcesResponseBodyProtectedResources();
            return TeaModel.build(map, self);
        }

        public ListProtectedResourcesResponseBodyProtectedResources setCreatedByProduct(String createdByProduct) {
            this.createdByProduct = createdByProduct;
            return this;
        }
        public String getCreatedByProduct() {
            return this.createdByProduct;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setProtectedDataSize(Long protectedDataSize) {
            this.protectedDataSize = protectedDataSize;
            return this;
        }
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setProtectedResourceId(String protectedResourceId) {
            this.protectedResourceId = protectedResourceId;
            return this;
        }
        public String getProtectedResourceId() {
            return this.protectedResourceId;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setSnapshotCount(Long snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Long getSnapshotCount() {
            return this.snapshotCount;
        }

        public ListProtectedResourcesResponseBodyProtectedResources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
