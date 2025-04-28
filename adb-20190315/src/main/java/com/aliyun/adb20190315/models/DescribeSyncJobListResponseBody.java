// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncJobListResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-j6c22lubl8d9l3989</p>
     */
    @NameInMap("DBClusterId")
    public Integer DBClusterId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>482B8BAE-6EC0-5C0E-B2AF-FD42A3FC5B67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried synchronization jobs.</p>
     */
    @NameInMap("SyncJobs")
    public java.util.List<DescribeSyncJobListResponseBodySyncJobs> syncJobs;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSyncJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncJobListResponseBody self = new DescribeSyncJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncJobListResponseBody setDBClusterId(Integer DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public Integer getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSyncJobListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSyncJobListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncJobListResponseBody setSyncJobs(java.util.List<DescribeSyncJobListResponseBodySyncJobs> syncJobs) {
        this.syncJobs = syncJobs;
        return this;
    }
    public java.util.List<DescribeSyncJobListResponseBodySyncJobs> getSyncJobs() {
        return this.syncJobs;
    }

    public DescribeSyncJobListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSyncJobListResponseBodySyncJobs extends TeaModel {
        /**
         * <p>The ID of the Spark job.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-xxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The description of the source instance or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceDBClusterDescription")
        public String sourceDBClusterDescription;

        /**
         * <p>The ID of the source cluster. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query backup set IDs.</p>
         * <blockquote>
         * <p> If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-t4n766v2llx852n81</p>
         */
        @NameInMap("SourceDBClusterId")
        public String sourceDBClusterId;

        /**
         * <p>The database type of the source instance or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("SourceDBType")
        public String sourceDBType;

        /**
         * <p>The storage size of the source instance or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceStorageSize")
        public Integer sourceStorageSize;

        /**
         * <p>The number of tables in the source instance or cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableNumber")
        public Integer sourceTableNumber;

        /**
         * <p>The synchronization platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB-CDC</p>
         */
        @NameInMap("SyncPlatform")
        public String syncPlatform;

        public static DescribeSyncJobListResponseBodySyncJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncJobListResponseBodySyncJobs self = new DescribeSyncJobListResponseBodySyncJobs();
            return TeaModel.build(map, self);
        }

        public DescribeSyncJobListResponseBodySyncJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSyncJobListResponseBodySyncJobs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSourceDBClusterDescription(String sourceDBClusterDescription) {
            this.sourceDBClusterDescription = sourceDBClusterDescription;
            return this;
        }
        public String getSourceDBClusterDescription() {
            return this.sourceDBClusterDescription;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSourceDBClusterId(String sourceDBClusterId) {
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }
        public String getSourceDBClusterId() {
            return this.sourceDBClusterId;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSourceDBType(String sourceDBType) {
            this.sourceDBType = sourceDBType;
            return this;
        }
        public String getSourceDBType() {
            return this.sourceDBType;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSourceStorageSize(Integer sourceStorageSize) {
            this.sourceStorageSize = sourceStorageSize;
            return this;
        }
        public Integer getSourceStorageSize() {
            return this.sourceStorageSize;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSourceTableNumber(Integer sourceTableNumber) {
            this.sourceTableNumber = sourceTableNumber;
            return this;
        }
        public Integer getSourceTableNumber() {
            return this.sourceTableNumber;
        }

        public DescribeSyncJobListResponseBodySyncJobs setSyncPlatform(String syncPlatform) {
            this.syncPlatform = syncPlatform;
            return this;
        }
        public String getSyncPlatform() {
            return this.syncPlatform;
        }

    }

}
