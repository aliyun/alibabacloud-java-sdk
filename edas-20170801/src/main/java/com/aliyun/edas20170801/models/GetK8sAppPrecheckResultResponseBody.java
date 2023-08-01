// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sAppPrecheckResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public GetK8sAppPrecheckResultResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>Specifies whether the precheck of the item was interrupted:</p>
         * <br>
         * <p>*   true: The precheck of the item was interrupted.</p>
         * <p>*   false: The precheck of the item was not interrupted.</p>
         */
        @NameInMap("Interrupted")
        public Boolean interrupted;

        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the precheck item passed the precheck:</p>
         * <br>
         * <p>*   true: The precheck item passed the precheck.</p>
         * <p>*   false: The precheck item failed the precheck.</p>
         */
        @NameInMap("Pass")
        public Boolean pass;

        /**
         * <p>The reason why the precheck item failed the precheck or the precheck of the item was interrupted. This parameter is left empty when the application passed the precheck.</p>
         */
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
        /**
         * <p>The precheck result for the application change.</p>
         */
        @NameInMap("JobResults")
        public java.util.List<GetK8sAppPrecheckResultResponseBodyDataJobResults> jobResults;

        /**
         * <p>The reason why the application failed the precheck. This parameter is left empty when the application passed the precheck.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The precheck state for the application change. Valid values:</p>
         * <br>
         * <p>*   checking: The application is being prechecked.</p>
         * <p>*   pass: The application passed the precheck.</p>
         * <p>*   failed: The application failed the precheck.</p>
         */
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
