// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("JobInputList")
    public GetJobInputStatisticInfoResponseBodyJobInputList jobInputList;

    @NameInMap("Total")
    public Integer total;

    public static GetJobInputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInputStatisticInfoResponseBody self = new GetJobInputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInputStatisticInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJobInputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInputStatisticInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJobInputStatisticInfoResponseBody setJobInputList(GetJobInputStatisticInfoResponseBodyJobInputList jobInputList) {
        this.jobInputList = jobInputList;
        return this;
    }
    public GetJobInputStatisticInfoResponseBodyJobInputList getJobInputList() {
        return this.jobInputList;
    }

    public GetJobInputStatisticInfoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("State")
        public String state;

        @NameInMap("BytesInput")
        public Long bytesInput;

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

        public static GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput self = new GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput();
            return TeaModel.build(map, self);
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setBytesInput(Long bytesInput) {
            this.bytesInput = bytesInput;
            return this;
        }
        public Long getBytesInput() {
            return this.bytesInput;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

    public static class GetJobInputStatisticInfoResponseBodyJobInputList extends TeaModel {
        @NameInMap("ClusterStatJobInput")
        public java.util.List<GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput> clusterStatJobInput;

        public static GetJobInputStatisticInfoResponseBodyJobInputList build(java.util.Map<String, ?> map) throws Exception {
            GetJobInputStatisticInfoResponseBodyJobInputList self = new GetJobInputStatisticInfoResponseBodyJobInputList();
            return TeaModel.build(map, self);
        }

        public GetJobInputStatisticInfoResponseBodyJobInputList setClusterStatJobInput(java.util.List<GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput> clusterStatJobInput) {
            this.clusterStatJobInput = clusterStatJobInput;
            return this;
        }
        public java.util.List<GetJobInputStatisticInfoResponseBodyJobInputListClusterStatJobInput> getClusterStatJobInput() {
            return this.clusterStatJobInput;
        }

    }

}
