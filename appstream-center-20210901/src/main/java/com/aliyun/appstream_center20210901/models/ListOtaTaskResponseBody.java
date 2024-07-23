// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListOtaTaskResponseBody extends TeaModel {
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
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListOtaTaskResponseBodyTaskList> taskList;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0.0.1-R-20220708.110604</p>
         */
        @NameInMap("OtaVersion")
        public String otaVersion;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskDisplayStatus")
        public String taskDisplayStatus;

        /**
         * <strong>example:</strong>
         * <p>ota-be7jzm29wrrz5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-04T14:36:00+08:00</p>
         */
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
