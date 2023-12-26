// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The list of O\&M tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTasksResponseBodyItems> items;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksResponseBody self = new DescribeActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksResponseBody setItems(java.util.List<DescribeActiveOperationTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeActiveOperationTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeActiveOperationTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeActiveOperationTasksResponseBodyItems extends TeaModel {
        /**
         * <p>N/A</p>
         */
        @NameInMap("AllowCancel")
        public String allowCancel;

        /**
         * <p>Indicates whether the time can be changed. Valid values:</p>
         * <br>
         * <p>*   **0**: The time cannot be changed.</p>
         * <p>*   **1**: The time can be changed.</p>
         */
        @NameInMap("AllowChange")
        public String allowChange;

        /**
         * <p>The change type.</p>
         */
        @NameInMap("ChangeLevel")
        public String changeLevel;

        /**
         * <p>N/A</p>
         */
        @NameInMap("ChangeLevelEn")
        public String changeLevelEn;

        /**
         * <p>The change type in Chinese.</p>
         */
        @NameInMap("ChangeLevelZh")
        public String changeLevelZh;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>N/A</p>
         */
        @NameInMap("CurrentAVZ")
        public String currentAVZ;

        /**
         * <p>The type of the database engine.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The end time of the task.</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>N/A</p>
         */
        @NameInMap("ImpactEn")
        public String impactEn;

        /**
         * <p>N/A</p>
         */
        @NameInMap("ImpactZh")
        public String impactZh;

        /**
         * <p>The description of the task.</p>
         */
        @NameInMap("InsComment")
        public String insComment;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the task was modified. The time is displayed in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The required preparation period between the task start time and the switchover time. The time is displayed in the *HH:mm:ss* format.</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region of the instance.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The result information. This parameter can be ignored.</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The start time of the task. The time is displayed in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>N/A</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The names of the subinstances.</p>
         */
        @NameInMap("SubInsNames")
        public java.util.List<String> subInsNames;

        /**
         * <p>The time when the task was interrupted. The time is displayed in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The type of the task.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>N/A</p>
         */
        @NameInMap("TaskTypeEn")
        public String taskTypeEn;

        /**
         * <p>The type of the task in Chinese.</p>
         */
        @NameInMap("TaskTypeZh")
        public String taskTypeZh;

        public static DescribeActiveOperationTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTasksResponseBodyItems self = new DescribeActiveOperationTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTasksResponseBodyItems setAllowCancel(String allowCancel) {
            this.allowCancel = allowCancel;
            return this;
        }
        public String getAllowCancel() {
            return this.allowCancel;
        }

        public DescribeActiveOperationTasksResponseBodyItems setAllowChange(String allowChange) {
            this.allowChange = allowChange;
            return this;
        }
        public String getAllowChange() {
            return this.allowChange;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevel(String changeLevel) {
            this.changeLevel = changeLevel;
            return this;
        }
        public String getChangeLevel() {
            return this.changeLevel;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevelEn(String changeLevelEn) {
            this.changeLevelEn = changeLevelEn;
            return this;
        }
        public String getChangeLevelEn() {
            return this.changeLevelEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setChangeLevelZh(String changeLevelZh) {
            this.changeLevelZh = changeLevelZh;
            return this;
        }
        public String getChangeLevelZh() {
            return this.changeLevelZh;
        }

        public DescribeActiveOperationTasksResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setCurrentAVZ(String currentAVZ) {
            this.currentAVZ = currentAVZ;
            return this;
        }
        public String getCurrentAVZ() {
            return this.currentAVZ;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeActiveOperationTasksResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribeActiveOperationTasksResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeActiveOperationTasksResponseBodyItems setImpactEn(String impactEn) {
            this.impactEn = impactEn;
            return this;
        }
        public String getImpactEn() {
            return this.impactEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setImpactZh(String impactZh) {
            this.impactZh = impactZh;
            return this;
        }
        public String getImpactZh() {
            return this.impactZh;
        }

        public DescribeActiveOperationTasksResponseBodyItems setInsComment(String insComment) {
            this.insComment = insComment;
            return this;
        }
        public String getInsComment() {
            return this.insComment;
        }

        public DescribeActiveOperationTasksResponseBodyItems setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeActiveOperationTasksResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribeActiveOperationTasksResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeActiveOperationTasksResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeActiveOperationTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeActiveOperationTasksResponseBodyItems setSubInsNames(java.util.List<String> subInsNames) {
            this.subInsNames = subInsNames;
            return this;
        }
        public java.util.List<String> getSubInsNames() {
            return this.subInsNames;
        }

        public DescribeActiveOperationTasksResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskTypeEn(String taskTypeEn) {
            this.taskTypeEn = taskTypeEn;
            return this;
        }
        public String getTaskTypeEn() {
            return this.taskTypeEn;
        }

        public DescribeActiveOperationTasksResponseBodyItems setTaskTypeZh(String taskTypeZh) {
            this.taskTypeZh = taskTypeZh;
            return this;
        }
        public String getTaskTypeZh() {
            return this.taskTypeZh;
        }

    }

}
