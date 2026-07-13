// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerStatsSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWorkerStatsSummaryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkerStatsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerStatsSummaryResponseBody self = new GetWorkerStatsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkerStatsSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkerStatsSummaryResponseBody setData(GetWorkerStatsSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkerStatsSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetWorkerStatsSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkerStatsSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkerStatsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkerStatsSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkerStatsSummaryResponseBodyData extends TeaModel {
        @NameInMap("OtherWorkers")
        public Integer otherWorkers;

        @NameInMap("RunningWorkers")
        public Integer runningWorkers;

        @NameInMap("StoppedWorkers")
        public Integer stoppedWorkers;

        @NameInMap("TotalWorkers")
        public Integer totalWorkers;

        public static GetWorkerStatsSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerStatsSummaryResponseBodyData self = new GetWorkerStatsSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkerStatsSummaryResponseBodyData setOtherWorkers(Integer otherWorkers) {
            this.otherWorkers = otherWorkers;
            return this;
        }
        public Integer getOtherWorkers() {
            return this.otherWorkers;
        }

        public GetWorkerStatsSummaryResponseBodyData setRunningWorkers(Integer runningWorkers) {
            this.runningWorkers = runningWorkers;
            return this;
        }
        public Integer getRunningWorkers() {
            return this.runningWorkers;
        }

        public GetWorkerStatsSummaryResponseBodyData setStoppedWorkers(Integer stoppedWorkers) {
            this.stoppedWorkers = stoppedWorkers;
            return this;
        }
        public Integer getStoppedWorkers() {
            return this.stoppedWorkers;
        }

        public GetWorkerStatsSummaryResponseBodyData setTotalWorkers(Integer totalWorkers) {
            this.totalWorkers = totalWorkers;
            return this;
        }
        public Integer getTotalWorkers() {
            return this.totalWorkers;
        }

    }

}
