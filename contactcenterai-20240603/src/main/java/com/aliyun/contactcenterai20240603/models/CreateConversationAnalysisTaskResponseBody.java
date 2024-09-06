// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateConversationAnalysisTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateConversationAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9F1DB065-AE0D-5EE3-B1AF-48632CB0831C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static CreateConversationAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationAnalysisTaskResponseBody self = new CreateConversationAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConversationAnalysisTaskResponseBody setData(CreateConversationAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConversationAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateConversationAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConversationAnalysisTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateConversationAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20240905-********-93E9-5D45-B4EF-045743A34071</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateConversationAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskResponseBodyData self = new CreateConversationAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
