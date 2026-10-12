// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result object.</p>
     */
    @NameInMap("Data")
    public CreateMobileAgentTaskResponseBodyData data;

    /**
     * <p>The message returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMobileAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentTaskResponseBody self = new CreateMobileAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMobileAgentTaskResponseBody setData(CreateMobileAgentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMobileAgentTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateMobileAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMobileAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMobileAgentTaskResponseBodyData extends TeaModel {
        /**
         * <p>The session ID. Tasks with the same session ID share the same context, such as ses-260702-21b****.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-261005-6ekkb1m9ls00</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-22ex666a653gq****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateMobileAgentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMobileAgentTaskResponseBodyData self = new CreateMobileAgentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMobileAgentTaskResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateMobileAgentTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
