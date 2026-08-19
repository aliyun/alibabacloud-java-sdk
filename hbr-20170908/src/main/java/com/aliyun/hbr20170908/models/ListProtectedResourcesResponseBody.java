// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListProtectedResourcesResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message. The value &quot;successful&quot; is returned for a successful request. An error message is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page. If this parameter is empty, no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJJ************MX0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of protected resources.</p>
     */
    @NameInMap("ProtectedResources")
    public java.util.List<ListProtectedResourcesResponseBodyProtectedResources> protectedResources;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB09****-<strong><strong>-</strong></strong>-****-********6C38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of protected resources.</p>
     * 
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
         * <p>The number of backup plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackupPlanCount")
        public Long backupPlanCount;

        /**
         * <p>The product capability to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><strong>HBR</strong>: Cloud Backup standard capability.</li>
         * <li><strong>BASIC</strong>: ECS File Backup Essential Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("CreatedByProduct")
        public String createdByProduct;

        /**
         * <p>The amount of protected data, in bytes. Currently, only ECS File Backup Essential Edition is supported.</p>
         * <ul>
         * <li><strong>SourceType=ECS_FILE</strong>: the backed-up block storage capacity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <p>The ID of the protected resource.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-0004************gs61</p>
         */
        @NameInMap("ProtectedResourceId")
        public String protectedResourceId;

        /**
         * <p>The resource ID.</p>
         * <ul>
         * <li><strong>SourceType=ECS_FILE</strong>: the ECS instance ID.</li>
         * <li><strong>SourceType=COMMON_FILE_SYSTEM</strong>: the CPFS data source ID.</li>
         * <li><strong>SourceType=COMMON_NAS</strong>: the on-premises NAS data source ID.</li>
         * <li><strong>SourceType=File</strong>: the local service client ID.</li>
         * <li><strong>SourceType=NAS</strong>: the Alibaba Cloud NAS file system ID.</li>
         * <li><strong>SourceType=OSS</strong>: the OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-wz95************7zrd</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The UID of the user who owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1024********0703</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The number of backups.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SnapshotCount")
        public Long snapshotCount;

        /**
         * <p>The backup feature type. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS file backup.</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: Cloud Parallel File Storage (CPFS) backup.</li>
         * <li><strong>COMMON_NAS</strong>: on-premises NAS backup.</li>
         * <li><strong>File</strong>: on-premises file backup.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
         * <li><strong>OSS</strong>: OSS backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static ListProtectedResourcesResponseBodyProtectedResources build(java.util.Map<String, ?> map) throws Exception {
            ListProtectedResourcesResponseBodyProtectedResources self = new ListProtectedResourcesResponseBodyProtectedResources();
            return TeaModel.build(map, self);
        }

        public ListProtectedResourcesResponseBodyProtectedResources setBackupPlanCount(Long backupPlanCount) {
            this.backupPlanCount = backupPlanCount;
            return this;
        }
        public Long getBackupPlanCount() {
            return this.backupPlanCount;
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

        public ListProtectedResourcesResponseBodyProtectedResources setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
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
