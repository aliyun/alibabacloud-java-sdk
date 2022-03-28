// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public GetTaskListResponseBodyResponse response;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListResponseBody self = new GetTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskListResponseBody setResponse(GetTaskListResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetTaskListResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskListResponseBodyResponseTaskList extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("TaskDescription")
        public String taskDescription;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskUid")
        public String taskUid;

        public static GetTaskListResponseBodyResponseTaskList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyResponseTaskList self = new GetTaskListResponseBodyResponseTaskList();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyResponseTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTaskListResponseBodyResponseTaskList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTaskListResponseBodyResponseTaskList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetTaskListResponseBodyResponseTaskList setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public GetTaskListResponseBodyResponseTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskListResponseBodyResponseTaskList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetTaskListResponseBodyResponseTaskList setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

    public static class GetTaskListResponseBodyResponse extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TaskList")
        public java.util.List<GetTaskListResponseBodyResponseTaskList> taskList;

        @NameInMap("Total")
        public Long total;

        public static GetTaskListResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyResponse self = new GetTaskListResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyResponse setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public GetTaskListResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetTaskListResponseBodyResponse setTaskList(java.util.List<GetTaskListResponseBodyResponseTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<GetTaskListResponseBodyResponseTaskList> getTaskList() {
            return this.taskList;
        }

        public GetTaskListResponseBodyResponse setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
