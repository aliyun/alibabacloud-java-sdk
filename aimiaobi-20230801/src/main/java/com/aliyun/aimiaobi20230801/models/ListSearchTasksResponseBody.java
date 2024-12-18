// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSearchTasksResponseBodyData> data;

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
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSearchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTasksResponseBody self = new ListSearchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSearchTasksResponseBody setData(java.util.List<ListSearchTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSearchTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListSearchTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSearchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSearchTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSearchTasksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-11-25 11:40:50</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DialogueType")
        public Integer dialogueType;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 11:40:50</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListSearchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTasksResponseBodyData self = new ListSearchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSearchTasksResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSearchTasksResponseBodyData setDialogueType(Integer dialogueType) {
            this.dialogueType = dialogueType;
            return this;
        }
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        public ListSearchTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListSearchTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListSearchTasksResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSearchTasksResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
