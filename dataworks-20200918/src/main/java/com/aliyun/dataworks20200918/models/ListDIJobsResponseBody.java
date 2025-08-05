// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIJobsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDIJobsResponseBodyPagingInfo pagingInfo;

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
        @NameInMap("DIJobId")
        @Deprecated
        public Long DIJobId;

        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("DIJobs")
        public java.util.List<ListDIJobsResponseBodyPagingInfoDIJobs> DIJobs;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

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
