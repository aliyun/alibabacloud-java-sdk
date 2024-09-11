// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData data;

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

    public static SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody self = new SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setData(SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>任务名称</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData self = new SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
