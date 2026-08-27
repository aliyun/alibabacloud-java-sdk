// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateRiskCheckTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateRiskCheckTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01A0220E-1F41-5260-A418-68286DF6B53D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRiskCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskCheckTaskResponseBody self = new CreateRiskCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRiskCheckTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRiskCheckTaskResponseBody setData(CreateRiskCheckTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRiskCheckTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateRiskCheckTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRiskCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRiskCheckTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rct-xxxxxxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateRiskCheckTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRiskCheckTaskResponseBodyData self = new CreateRiskCheckTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRiskCheckTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
