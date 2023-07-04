// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallChatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<TaskCallChatsResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskCallChatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskCallChatsResponseBody self = new TaskCallChatsResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskCallChatsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TaskCallChatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskCallChatsResponseBody setModel(java.util.List<TaskCallChatsResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<TaskCallChatsResponseBodyModel> getModel() {
        return this.model;
    }

    public TaskCallChatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskCallChatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TaskCallChatsResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TaskCallChatsResponseBodyModel extends TeaModel {
        /**
         * <p>说话内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>说话时间</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>说话号码</p>
         */
        @NameInMap("FromNumber")
        public String fromNumber;

        public static TaskCallChatsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TaskCallChatsResponseBodyModel self = new TaskCallChatsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TaskCallChatsResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TaskCallChatsResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public TaskCallChatsResponseBodyModel setFromNumber(String fromNumber) {
            this.fromNumber = fromNumber;
            return this;
        }
        public String getFromNumber() {
            return this.fromNumber;
        }

    }

}
