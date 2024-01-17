// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDialoguesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListDialoguesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListDialoguesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDialoguesResponseBody self = new ListDialoguesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDialoguesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDialoguesResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListDialoguesResponseBody setData(java.util.List<ListDialoguesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDialoguesResponseBodyData> getData() {
        return this.data;
    }

    public ListDialoguesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDialoguesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDialoguesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDialoguesResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDialoguesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDialoguesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDialoguesResponseBodyData extends TeaModel {
        @NameInMap("Bot")
        public String bot;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DialogueType")
        public Integer dialogueType;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("User")
        public String user;

        public static ListDialoguesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDialoguesResponseBodyData self = new ListDialoguesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDialoguesResponseBodyData setBot(String bot) {
            this.bot = bot;
            return this;
        }
        public String getBot() {
            return this.bot;
        }

        public ListDialoguesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDialoguesResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDialoguesResponseBodyData setDialogueType(Integer dialogueType) {
            this.dialogueType = dialogueType;
            return this;
        }
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        public ListDialoguesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDialoguesResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
