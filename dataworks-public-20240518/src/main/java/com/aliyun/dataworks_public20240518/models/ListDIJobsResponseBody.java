// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDIJobsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7263E4AC-9D2E-5B29-B8AF-7C5012E92A41</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDIJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobsResponseBody self = new ListDIJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIJobsResponseBody setPagingInfo(ListDIJobsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDIJobsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDIJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIJobsResponseBodyPagingInfoDIJobs extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Id field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>32599</p>
         */
        @NameInMap("DIJobId")
        @Deprecated
        public Long DIJobId;

        /**
         * <p>The type of the destination data source. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, Loghub, STARROCKS, DataHub, ANALYTICDB_FOR_MYSQL, Kafka, and Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The ID of the data integration task.</p>
         * 
         * <strong>example:</strong>
         * <p>32599</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_to_holo_sync_35197</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The synchronization status. Valid values:</p>
         * <ul>
         * <li>Finished: finished successfully</li>
         * <li>Initialized: initialized</li>
         * <li>Stopped: stopped</li>
         * <li>Failed: failed</li>
         * <li>Running: running</li>
         * <li>Stopping: stopping</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization</li>
         * <li>RealtimeIncremental: real-time incremental synchronization</li>
         * <li>Full: full synchronization</li>
         * <li>OfflineIncremental: batch incremental synchronization</li>
         * <li>FullAndOfflineIncremental: full and batch incremental synchronization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The owner of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>3726346</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>26442</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the source data source. Valid values: PolarDB, MySQL, Kafka, Loghub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SqlServer, Doris, and ClickHouse.</p>
         * 
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        public static ListDIJobsResponseBodyPagingInfoDIJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobsResponseBodyPagingInfoDIJobs self = new ListDIJobsResponseBodyPagingInfoDIJobs();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListDIJobsResponseBodyPagingInfoDIJobs setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setDestinationDataSourceType(String destinationDataSourceType) {
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDIJobsResponseBodyPagingInfoDIJobs setSourceDataSourceType(String sourceDataSourceType) {
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

    }

    public static class ListDIJobsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The data integration tasks.</p>
         */
        @NameInMap("DIJobs")
        public java.util.List<ListDIJobsResponseBodyPagingInfoDIJobs> DIJobs;

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDIJobsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobsResponseBodyPagingInfo self = new ListDIJobsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDIJobsResponseBodyPagingInfo setDIJobs(java.util.List<ListDIJobsResponseBodyPagingInfoDIJobs> DIJobs) {
            this.DIJobs = DIJobs;
            return this;
        }
        public java.util.List<ListDIJobsResponseBodyPagingInfoDIJobs> getDIJobs() {
            return this.DIJobs;
        }

        public ListDIJobsResponseBodyPagingInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDIJobsResponseBodyPagingInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDIJobsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
