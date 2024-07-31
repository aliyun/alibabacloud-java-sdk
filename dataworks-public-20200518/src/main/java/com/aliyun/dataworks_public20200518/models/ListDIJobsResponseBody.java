// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIJobsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("DIJobPaging")
    public ListDIJobsResponseBodyDIJobPaging DIJobPaging;

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

    public ListDIJobsResponseBody setDIJobPaging(ListDIJobsResponseBodyDIJobPaging DIJobPaging) {
        this.DIJobPaging = DIJobPaging;
        return this;
    }
    public ListDIJobsResponseBodyDIJobPaging getDIJobPaging() {
        return this.DIJobPaging;
    }

    public ListDIJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIJobsResponseBodyDIJobPagingDIJobs extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16626</p>
         */
        @NameInMap("DIJobId")
        public Long DIJobId;

        /**
         * <p>The type of the destination. The value Hologres is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_to_holo_sync_8772</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Finished</li>
         * <li>Initialized</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Stopping</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li>FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization</li>
         * <li>RealtimeIncremental: real-time incremental synchronization</li>
         * <li>Full: one-time full synchronization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1967</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the source. The value MySQL is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        public static ListDIJobsResponseBodyDIJobPagingDIJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobsResponseBodyDIJobPagingDIJobs self = new ListDIJobsResponseBodyDIJobPagingDIJobs();
            return TeaModel.build(map, self);
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setDestinationDataSourceType(String destinationDataSourceType) {
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDIJobsResponseBodyDIJobPagingDIJobs setSourceDataSourceType(String sourceDataSourceType) {
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

    }

    public static class ListDIJobsResponseBodyDIJobPaging extends TeaModel {
        /**
         * <p>The list of tasks.</p>
         */
        @NameInMap("DIJobs")
        public java.util.List<ListDIJobsResponseBodyDIJobPagingDIJobs> DIJobs;

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
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDIJobsResponseBodyDIJobPaging build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobsResponseBodyDIJobPaging self = new ListDIJobsResponseBodyDIJobPaging();
            return TeaModel.build(map, self);
        }

        public ListDIJobsResponseBodyDIJobPaging setDIJobs(java.util.List<ListDIJobsResponseBodyDIJobPagingDIJobs> DIJobs) {
            this.DIJobs = DIJobs;
            return this;
        }
        public java.util.List<ListDIJobsResponseBodyDIJobPagingDIJobs> getDIJobs() {
            return this.DIJobs;
        }

        public ListDIJobsResponseBodyDIJobPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDIJobsResponseBodyDIJobPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDIJobsResponseBodyDIJobPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
