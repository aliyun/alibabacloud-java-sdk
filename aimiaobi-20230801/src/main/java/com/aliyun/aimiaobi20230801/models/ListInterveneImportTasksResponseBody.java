// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneImportTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInterveneImportTasksResponseBodyData data;

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
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInterveneImportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneImportTasksResponseBody self = new ListInterveneImportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterveneImportTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInterveneImportTasksResponseBody setData(ListInterveneImportTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInterveneImportTasksResponseBodyData getData() {
        return this.data;
    }

    public ListInterveneImportTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInterveneImportTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInterveneImportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterveneImportTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInterveneImportTasksResponseBodyDataStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>4854</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>12344454</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static ListInterveneImportTasksResponseBodyDataStatusList build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneImportTasksResponseBodyDataStatusList self = new ListInterveneImportTasksResponseBodyDataStatusList();
            return TeaModel.build(map, self);
        }

        public ListInterveneImportTasksResponseBodyDataStatusList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListInterveneImportTasksResponseBodyDataStatusList setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListInterveneImportTasksResponseBodyDataStatusList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListInterveneImportTasksResponseBodyDataStatusList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListInterveneImportTasksResponseBodyDataStatusList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListInterveneImportTasksResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Integer pageIndex;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("StatusList")
        public java.util.List<ListInterveneImportTasksResponseBodyDataStatusList> statusList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListInterveneImportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneImportTasksResponseBodyData self = new ListInterveneImportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInterveneImportTasksResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListInterveneImportTasksResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListInterveneImportTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInterveneImportTasksResponseBodyData setStatusList(java.util.List<ListInterveneImportTasksResponseBodyDataStatusList> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<ListInterveneImportTasksResponseBodyDataStatusList> getStatusList() {
            return this.statusList;
        }

        public ListInterveneImportTasksResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
