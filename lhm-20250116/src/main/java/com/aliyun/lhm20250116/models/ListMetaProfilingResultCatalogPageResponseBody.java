// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultCatalogPageResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListMetaProfilingResultCatalogPageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The parameter is invalid or missing.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMetaProfilingResultCatalogPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultCatalogPageResponseBody self = new ListMetaProfilingResultCatalogPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultCatalogPageResponseBody setData(java.util.List<ListMetaProfilingResultCatalogPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetaProfilingResultCatalogPageResponseBodyData> getData() {
        return this.data;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaProfilingResultCatalogPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaProfilingResultCatalogPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>catalog_hive_prod</p>
         */
        @NameInMap("catalogName")
        public String catalogName;

        /**
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <strong>example:</strong>
         * <p>100256</p>
         */
        @NameInMap("jobId")
        public Long jobId;

        /**
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("lastModified")
        public String lastModified;

        /**
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("metaDatasourceId")
        public Long metaDatasourceId;

        /**
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        @NameInMap("metaDatasourceType")
        public String metaDatasourceType;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("migrationProgress")
        public Double migrationProgress;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("migrationStatus")
        public String migrationStatus;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("partitionCount")
        public Integer partitionCount;

        /**
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("ptTableCount")
        public Integer ptTableCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("recordCount")
        public Long recordCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("schemaCount")
        public Integer schemaCount;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("storageSize")
        public String storageSize;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("tableCount")
        public Integer tableCount;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("viewCount")
        public Integer viewCount;

        public static ListMetaProfilingResultCatalogPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaProfilingResultCatalogPageResponseBodyData self = new ListMetaProfilingResultCatalogPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setMetaDatasourceId(Long metaDatasourceId) {
            this.metaDatasourceId = metaDatasourceId;
            return this;
        }
        public Long getMetaDatasourceId() {
            return this.metaDatasourceId;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setMetaDatasourceType(String metaDatasourceType) {
            this.metaDatasourceType = metaDatasourceType;
            return this;
        }
        public String getMetaDatasourceType() {
            return this.metaDatasourceType;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setMigrationProgress(Double migrationProgress) {
            this.migrationProgress = migrationProgress;
            return this;
        }
        public Double getMigrationProgress() {
            return this.migrationProgress;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setPartitionCount(Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setPtTableCount(Integer ptTableCount) {
            this.ptTableCount = ptTableCount;
            return this;
        }
        public Integer getPtTableCount() {
            return this.ptTableCount;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setSchemaCount(Integer schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Integer getSchemaCount() {
            return this.schemaCount;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public ListMetaProfilingResultCatalogPageResponseBodyData setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Integer getViewCount() {
            return this.viewCount;
        }

    }

}
