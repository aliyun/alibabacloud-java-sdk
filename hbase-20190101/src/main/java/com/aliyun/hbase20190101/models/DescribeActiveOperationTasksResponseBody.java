// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The list of O&amp;M tasks.</p>
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
     * <p>The maximum number of records per page.</p>
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
     * <p>C634E813-42FA-53D2-A7EB-B881C4B264CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
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
         * <p>Indicates whether the task can be canceled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task cannot be canceled.</li>
         * <li><strong>1</strong>: The task can be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowCancel")
        public String allowCancel;

        /**
         * <p>Indicates whether the time can be modified. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The time cannot be modified.</li>
         * <li><strong>1</strong>: The time can be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowChange")
        public String allowChange;

        /**
         * <p>The change level.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ChangeLevel")
        public String changeLevel;

        /**
         * <p>The change level name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Risk repairment</p>
         */
        @NameInMap("ChangeLevelEn")
        public String changeLevelEn;

        /**
         * <p>The change level name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>风险修复</p>
         */
        @NameInMap("ChangeLevelZh")
        public String changeLevelZh;

        /**
         * <p>The time when the O&amp;M task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-15 23:59:59</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The current availability zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-et-a</p>
         */
        @NameInMap("CurrentAVZ")
        public String currentAVZ;

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><strong>hbaseue</strong>: ApsaraDB for HBase Enhanced Edition.</li>
         * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition.</li>
         * <li><strong>bds</strong>: BDS data synchronization service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The database version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The latest time to which the O&amp;M task execution time can be adjusted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-19 23:59:59</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The O&amp;M task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The business impact in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Transient instance disconnection</p>
         */
        @NameInMap("ImpactEn")
        public String impactEn;

        /**
         * <p>The business impact in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>中断</p>
         */
        @NameInMap("ImpactZh")
        public String impactZh;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("InsComment")
        public String insComment;

        /**
         * <p>The HBase instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the O&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-19 14:00:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The preparation time required between the start time of the O&amp;M task and the switchover time.</p>
         * 
         * <strong>example:</strong>
         * <p>14:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The description of the execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the O&amp;M task starts to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-19 10:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task running status. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Waiting for the user to specify a time.</li>
         * <li><strong>3</strong>: Waiting for processing.</li>
         * <li><strong>4</strong>: Processing.</li>
         * <li><strong>5</strong>: Succeeded.</li>
         * <li><strong>6</strong>: Failed.</li>
         * <li><strong>7</strong>: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubInsNames")
        public java.util.List<String> subInsNames;

        /**
         * <p>The time when the system initiates the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-19 14:00:00</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The task type. The value <strong>rds_apsaradb_upgrade</strong> indicates a minor version upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The task type in English.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
         */
        @NameInMap("TaskTypeEn")
        public String taskTypeEn;

        /**
         * <p>The task type in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>小版本升级</p>
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
