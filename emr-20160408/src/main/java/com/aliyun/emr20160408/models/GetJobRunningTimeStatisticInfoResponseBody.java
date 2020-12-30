// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobRunningTimeStatisticInfoResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("RunningTimeList")
    public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList runningTimeList;

    public static GetJobRunningTimeStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobRunningTimeStatisticInfoResponseBody self = new GetJobRunningTimeStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobRunningTimeStatisticInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJobRunningTimeStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobRunningTimeStatisticInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJobRunningTimeStatisticInfoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetJobRunningTimeStatisticInfoResponseBody setRunningTimeList(GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList runningTimeList) {
        this.runningTimeList = runningTimeList;
        return this;
    }
    public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList getRunningTimeList() {
        return this.runningTimeList;
    }

    public static class GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("RunningTime")
        public Long runningTime;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("User")
        public String user;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Name")
        public String name;

        @NameInMap("ApplicationId")
        public String applicationId;

        public static GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime build(java.util.Map<String, ?> map) throws Exception {
            GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime self = new GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime();
            return TeaModel.build(map, self);
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

    public static class GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList extends TeaModel {
        @NameInMap("ClusterStatJobRunningTime")
        public java.util.List<GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime> clusterStatJobRunningTime;

        public static GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList self = new GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList();
            return TeaModel.build(map, self);
        }

        public GetJobRunningTimeStatisticInfoResponseBodyRunningTimeList setClusterStatJobRunningTime(java.util.List<GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime> clusterStatJobRunningTime) {
            this.clusterStatJobRunningTime = clusterStatJobRunningTime;
            return this;
        }
        public java.util.List<GetJobRunningTimeStatisticInfoResponseBodyRunningTimeListClusterStatJobRunningTime> getClusterStatJobRunningTime() {
            return this.clusterStatJobRunningTime;
        }

    }

}
