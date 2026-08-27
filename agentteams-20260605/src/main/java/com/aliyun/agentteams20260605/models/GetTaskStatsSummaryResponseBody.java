// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTaskStatsSummaryResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetTaskStatsSummaryResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The number of tasks in this status.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
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
        /**
         * <p>The average task duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000.5</p>
         */
        @NameInMap("AverageTaskDuration")
        public Double averageTaskDuration;

        /**
         * <p>The task status distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("StatusDistribution")
        public java.util.List<GetTaskStatsSummaryResponseBodyDataStatusDistribution> statusDistribution;

        /**
         * <p>The total token consumption of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("TaskTokenConsumption")
        public Long taskTokenConsumption;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
