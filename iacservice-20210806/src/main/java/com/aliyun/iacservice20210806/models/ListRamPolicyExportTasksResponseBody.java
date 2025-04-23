// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("ramPolicyExportTasks")
    public java.util.List<ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks> ramPolicyExportTasks;

    /**
     * <strong>example:</strong>
     * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRamPolicyExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTasksResponseBody self = new ListRamPolicyExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRamPolicyExportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRamPolicyExportTasksResponseBody setRamPolicyExportTasks(java.util.List<ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks> ramPolicyExportTasks) {
        this.ramPolicyExportTasks = ramPolicyExportTasks;
        return this;
    }
    public java.util.List<ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks> getRamPolicyExportTasks() {
        return this.ramPolicyExportTasks;
    }

    public ListRamPolicyExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRamPolicyExportTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-09-16T03:59:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("currentPolicyStatus")
        public String currentPolicyStatus;

        @NameInMap("currentPolicyVersion")
        public String currentPolicyVersion;

        @NameInMap("elapsedTime")
        public Long elapsedTime;

        @NameInMap("exportTime")
        public String exportTime;

        /**
         * <strong>example:</strong>
         * <p>mod-51fdfefa8788e82c9</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rpe-457ffe0252e48f9286a</p>
         */
        @NameInMap("ramPolicyExportTaskId")
        public String ramPolicyExportTaskId;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>12345678/default/rampolicytask/rpe-4399111870d7e6b0f11a</p>
         */
        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        public static ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks self = new ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks();
            return TeaModel.build(map, self);
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setCurrentPolicyStatus(String currentPolicyStatus) {
            this.currentPolicyStatus = currentPolicyStatus;
            return this;
        }
        public String getCurrentPolicyStatus() {
            return this.currentPolicyStatus;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setCurrentPolicyVersion(String currentPolicyVersion) {
            this.currentPolicyVersion = currentPolicyVersion;
            return this;
        }
        public String getCurrentPolicyVersion() {
            return this.currentPolicyVersion;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setExportTime(String exportTime) {
            this.exportTime = exportTime;
            return this;
        }
        public String getExportTime() {
            return this.exportTime;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setRamPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRamPolicyExportTasksResponseBodyRamPolicyExportTasks setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

    }

}
