// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitEnterpriseVocAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitEnterpriseVocAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskResponseBody self = new SubmitEnterpriseVocAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setData(SubmitEnterpriseVocAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitEnterpriseVocAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitEnterpriseVocAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitEnterpriseVocAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitEnterpriseVocAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskResponseBodyData self = new SubmitEnterpriseVocAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
