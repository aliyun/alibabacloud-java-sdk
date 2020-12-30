// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("JobOutputList")
    public GetJobOutputStatisticInfoResponseBodyJobOutputList jobOutputList;

    public static GetJobOutputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobOutputStatisticInfoResponseBody self = new GetJobOutputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobOutputStatisticInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJobOutputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobOutputStatisticInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJobOutputStatisticInfoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetJobOutputStatisticInfoResponseBody setJobOutputList(GetJobOutputStatisticInfoResponseBodyJobOutputList jobOutputList) {
        this.jobOutputList = jobOutputList;
        return this;
    }
    public GetJobOutputStatisticInfoResponseBodyJobOutputList getJobOutputList() {
        return this.jobOutputList;
    }

    public static class GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

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

        @NameInMap("BytesOutput")
        public Long bytesOutput;

        @NameInMap("Name")
        public String name;

        @NameInMap("ApplicationId")
        public String applicationId;

        public static GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput self = new GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput();
            return TeaModel.build(map, self);
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setBytesOutput(Long bytesOutput) {
            this.bytesOutput = bytesOutput;
            return this;
        }
        public Long getBytesOutput() {
            return this.bytesOutput;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

    public static class GetJobOutputStatisticInfoResponseBodyJobOutputList extends TeaModel {
        @NameInMap("ClusterStatJobOutput")
        public java.util.List<GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput> clusterStatJobOutput;

        public static GetJobOutputStatisticInfoResponseBodyJobOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetJobOutputStatisticInfoResponseBodyJobOutputList self = new GetJobOutputStatisticInfoResponseBodyJobOutputList();
            return TeaModel.build(map, self);
        }

        public GetJobOutputStatisticInfoResponseBodyJobOutputList setClusterStatJobOutput(java.util.List<GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput> clusterStatJobOutput) {
            this.clusterStatJobOutput = clusterStatJobOutput;
            return this;
        }
        public java.util.List<GetJobOutputStatisticInfoResponseBodyJobOutputListClusterStatJobOutput> getClusterStatJobOutput() {
            return this.clusterStatJobOutput;
        }

    }

}
