// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateVideoCreationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateVideoCreationTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("retryAble")
    public Boolean retryAble;

    @NameInMap("success")
    public Boolean success;

    public static CreateVideoCreationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCreationTaskResponseBody self = new CreateVideoCreationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoCreationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVideoCreationTaskResponseBody setData(CreateVideoCreationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVideoCreationTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateVideoCreationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVideoCreationTaskResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public CreateVideoCreationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateVideoCreationTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("estimatedWaitTimeInSeconds")
        public Long estimatedWaitTimeInSeconds;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateVideoCreationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoCreationTaskResponseBodyData self = new CreateVideoCreationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVideoCreationTaskResponseBodyData setEstimatedWaitTimeInSeconds(Long estimatedWaitTimeInSeconds) {
            this.estimatedWaitTimeInSeconds = estimatedWaitTimeInSeconds;
            return this;
        }
        public Long getEstimatedWaitTimeInSeconds() {
            return this.estimatedWaitTimeInSeconds;
        }

        public CreateVideoCreationTaskResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateVideoCreationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
