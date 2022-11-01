// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListOtaTaskResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListOtaTaskResponseBodyTaskList> taskList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOtaTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOtaTaskResponseBody self = new ListOtaTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOtaTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOtaTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOtaTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOtaTaskResponseBody setTaskList(java.util.List<ListOtaTaskResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListOtaTaskResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public ListOtaTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOtaTaskResponseBodyTaskList extends TeaModel {
        @NameInMap("OtaVersion")
        public String otaVersion;

        @NameInMap("TaskDisplayStatus")
        public String taskDisplayStatus;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStartTime")
        public String taskStartTime;

        public static ListOtaTaskResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListOtaTaskResponseBodyTaskList self = new ListOtaTaskResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListOtaTaskResponseBodyTaskList setOtaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }
        public String getOtaVersion() {
            return this.otaVersion;
        }

        public ListOtaTaskResponseBodyTaskList setTaskDisplayStatus(String taskDisplayStatus) {
            this.taskDisplayStatus = taskDisplayStatus;
            return this;
        }
        public String getTaskDisplayStatus() {
            return this.taskDisplayStatus;
        }

        public ListOtaTaskResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOtaTaskResponseBodyTaskList setTaskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

    }

}
