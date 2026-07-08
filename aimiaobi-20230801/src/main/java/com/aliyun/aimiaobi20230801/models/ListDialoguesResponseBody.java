// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDialoguesResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>List of generation history records.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDialoguesResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Indicates whether the operation succeeded. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>Model output.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Bot")
        public String bot;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Generation type. Valid values: 1 (creation) and 2 (intelligent search). Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DialogueType")
        public Integer dialogueType;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>User input.</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
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
