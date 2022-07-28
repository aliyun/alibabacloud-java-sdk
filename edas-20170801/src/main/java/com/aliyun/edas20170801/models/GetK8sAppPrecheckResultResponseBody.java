// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sAppPrecheckResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetK8sAppPrecheckResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetK8sAppPrecheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sAppPrecheckResultResponseBody self = new GetK8sAppPrecheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetK8sAppPrecheckResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetK8sAppPrecheckResultResponseBody setData(GetK8sAppPrecheckResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetK8sAppPrecheckResultResponseBodyData getData() {
        return this.data;
    }

    public GetK8sAppPrecheckResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetK8sAppPrecheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetK8sAppPrecheckResultResponseBodyDataJobResults extends TeaModel {
        @NameInMap("Interrupted")
        public Boolean interrupted;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Reason")
        public String reason;

        public static GetK8sAppPrecheckResultResponseBodyDataJobResults build(java.util.Map<String, ?> map) throws Exception {
            GetK8sAppPrecheckResultResponseBodyDataJobResults self = new GetK8sAppPrecheckResultResponseBodyDataJobResults();
            return TeaModel.build(map, self);
        }

        public GetK8sAppPrecheckResultResponseBodyDataJobResults setInterrupted(Boolean interrupted) {
            this.interrupted = interrupted;
            return this;
        }
        public Boolean getInterrupted() {
            return this.interrupted;
        }

        public GetK8sAppPrecheckResultResponseBodyDataJobResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetK8sAppPrecheckResultResponseBodyDataJobResults setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetK8sAppPrecheckResultResponseBodyDataJobResults setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetK8sAppPrecheckResultResponseBodyData extends TeaModel {
        @NameInMap("JobResults")
        public java.util.List<GetK8sAppPrecheckResultResponseBodyDataJobResults> jobResults;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public String status;

        public static GetK8sAppPrecheckResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetK8sAppPrecheckResultResponseBodyData self = new GetK8sAppPrecheckResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetK8sAppPrecheckResultResponseBodyData setJobResults(java.util.List<GetK8sAppPrecheckResultResponseBodyDataJobResults> jobResults) {
            this.jobResults = jobResults;
            return this;
        }
        public java.util.List<GetK8sAppPrecheckResultResponseBodyDataJobResults> getJobResults() {
            return this.jobResults;
        }

        public GetK8sAppPrecheckResultResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetK8sAppPrecheckResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
