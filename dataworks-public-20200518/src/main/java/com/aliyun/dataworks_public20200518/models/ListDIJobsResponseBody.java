// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIJobsResponseBody extends TeaModel {
    @NameInMap("DIJobPaging")
    public ListDIJobsResponseBodyDIJobPaging DIJobPaging;

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
        @NameInMap("DIJobId")
        public Long DIJobId;

        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("MigrationType")
        public String migrationType;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("DIJobs")
        public java.util.List<ListDIJobsResponseBodyDIJobPagingDIJobs> DIJobs;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
