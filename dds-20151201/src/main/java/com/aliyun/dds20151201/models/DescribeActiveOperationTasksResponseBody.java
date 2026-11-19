// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The O&amp;M tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTasksResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111E7B16-0A87-4CBA-B271-F34AD61E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned task records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>Specifies whether the task can be canceled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The task can be canceled.</li>
         * <li><strong>0</strong>: The task cannot be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowCancel")
        public String allowCancel;

        /**
         * <p>Specifies whether the execution time can be modified. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The execution time can be modified.</li>
         * <li><strong>0</strong>: The execution time cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowChange")
        public String allowChange;

        /**
         * <p>The event level code. Valid values:</p>
         * <ul>
         * <li><strong>S1</strong>: system O&amp;M</li>
         * <li><strong>S0</strong>: risk remediation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("ChangeLevel")
        public String changeLevel;

        /**
         * <p>The event level in English.</p>
         * 
         * <strong>example:</strong>
         * <p>System maintenance</p>
         */
        @NameInMap("ChangeLevelEn")
        public String changeLevelEn;

        /**
         * <p>The event level in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>System O&amp;M</p>
         */
        @NameInMap("ChangeLevelZh")
        public String changeLevelZh;

        /**
         * <p>The creation time. The time follows the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-30T14:30:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The current zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("CurrentAVZ")
        public String currentAVZ;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>mongoDb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The database DPI engine version number.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The deadline for adjusting the task execution time. The time follows the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-30T23:59:59Z</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The event impact in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Transient instance disconnection</p>
         */
        @NameInMap("ImpactEn")
        public String impactEn;

        /**
         * <p>The event impact in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>Transient instance disconnection</p>
         */
        @NameInMap("ImpactZh")
        public String impactZh;

        /**
         * <p>The alias or description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InsComment")
        public String insComment;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp16aaccfe10****</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The modification time. The time follows the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-30T14:30:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time required between the start time of the O&amp;M task and the switchover time. The time follows the <i>HH:mm:ss</i> format.</p>
         * 
         * <strong>example:</strong>
         * <p>04:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The ID of the region to which the pending event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The execution result information.</p>
         * 
         * <strong>example:</strong>
         * <p>userCancel</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the backend executes the task. The time follows the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-30T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: pending tasks</li>
         * <li><strong>4</strong>: in-progress tasks</li>
         * <li><strong>5</strong>: successfully completed tasks</li>
         * <li><strong>6</strong>: failed tasks</li>
         * <li><strong>7</strong>: canceled tasks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The child instances.</p>
         */
        @NameInMap("SubInsNames")
        public java.util.List<String> subInsNames;

        /**
         * <p>The time when the backend initiates the switchover. The time follows the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-30T14:30:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The task parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>rds_apsaradb_ha</strong>: primary/secondary node switch</li>
         * <li><strong>rds_apsaradb_transfer</strong>: instance migration</li>
         * <li><strong>rds_apsaradb_upgrade</strong>: minor version upgrade</li>
         * <li><strong>rds_apsaradb_maxscale</strong>: proxy minor version upgrade</li>
         * <li><strong>all</strong>: all task types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The task reason in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Minor version update</p>
         */
        @NameInMap("TaskTypeEn")
        public String taskTypeEn;

        /**
         * <p>The task reason in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>Minor version upgrade</p>
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

        public DescribeActiveOperationTasksResponseBodyItems setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
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
