// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneImportTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInterveneImportTasksResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

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
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("StatusList")
        public java.util.List<ListInterveneImportTasksResponseBodyDataStatusList> statusList;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListInterveneImportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneImportTasksResponseBodyData self = new ListInterveneImportTasksResponseBodyData();
            return TeaModel.build(map, self);
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
