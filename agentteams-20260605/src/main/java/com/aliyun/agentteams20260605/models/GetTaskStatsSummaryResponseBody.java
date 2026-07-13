// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTaskStatsSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTaskStatsSummaryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskStatsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatsSummaryResponseBody self = new GetTaskStatsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatsSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskStatsSummaryResponseBody setData(GetTaskStatsSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskStatsSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetTaskStatsSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskStatsSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskStatsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatsSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskStatsSummaryResponseBodyDataStatusDistribution extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Status")
        public String status;

        public static GetTaskStatsSummaryResponseBodyDataStatusDistribution build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatsSummaryResponseBodyDataStatusDistribution self = new GetTaskStatsSummaryResponseBodyDataStatusDistribution();
            return TeaModel.build(map, self);
        }

        public GetTaskStatsSummaryResponseBodyDataStatusDistribution setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetTaskStatsSummaryResponseBodyDataStatusDistribution setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetTaskStatsSummaryResponseBodyData extends TeaModel {
        @NameInMap("AverageTaskDuration")
        public Double averageTaskDuration;

        @NameInMap("StatusDistribution")
        public java.util.List<GetTaskStatsSummaryResponseBodyDataStatusDistribution> statusDistribution;

        @NameInMap("TaskTokenConsumption")
        public Long taskTokenConsumption;

        @NameInMap("TotalTasks")
        public Integer totalTasks;

        public static GetTaskStatsSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatsSummaryResponseBodyData self = new GetTaskStatsSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskStatsSummaryResponseBodyData setAverageTaskDuration(Double averageTaskDuration) {
            this.averageTaskDuration = averageTaskDuration;
            return this;
        }
        public Double getAverageTaskDuration() {
            return this.averageTaskDuration;
        }

        public GetTaskStatsSummaryResponseBodyData setStatusDistribution(java.util.List<GetTaskStatsSummaryResponseBodyDataStatusDistribution> statusDistribution) {
            this.statusDistribution = statusDistribution;
            return this;
        }
        public java.util.List<GetTaskStatsSummaryResponseBodyDataStatusDistribution> getStatusDistribution() {
            return this.statusDistribution;
        }

        public GetTaskStatsSummaryResponseBodyData setTaskTokenConsumption(Long taskTokenConsumption) {
            this.taskTokenConsumption = taskTokenConsumption;
            return this;
        }
        public Long getTaskTokenConsumption() {
            return this.taskTokenConsumption;
        }

        public GetTaskStatsSummaryResponseBodyData setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

    }

}
