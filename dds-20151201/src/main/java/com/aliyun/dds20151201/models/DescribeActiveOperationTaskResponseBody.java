// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponseBody extends TeaModel {
    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>6FD47DC4-0750-5524-A89E-E7D559Cxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeActiveOperationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskResponseBody self = new DescribeActiveOperationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskResponseBody setItems(java.util.List<DescribeActiveOperationTaskResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeActiveOperationTaskResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeActiveOperationTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeActiveOperationTaskResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-06T13:11:08Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The database type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The deadline before which the time to preform the task can be modified. The time in UTC is displayed in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-29T13:59:59Z</p>
         */
        @NameInMap("Deadline")
        public String deadline;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50xx</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp12721xxxx9b914</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The time when the task was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T08:18:53Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The required preparation period between the task start time and the switchover time. The time is displayed in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>14:00:00</p>
         */
        @NameInMap("PrepareInterval")
        public String prepareInterval;

        /**
         * <p>The region of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The result information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The time when the task was preformed. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-20T02:40:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li>2: The task is waiting for users to specify a switchover time.</li>
         * <li>3: The task is waiting to be performed.</li>
         * <li>4: The task is being performed. If the task is in this state, the ModifyActiveOperationTask operation cannot be called to modify the scheduled switchover time.</li>
         * <li>5: The task is performed.</li>
         * <li>6: The task fails.</li>
         * <li>7: The task is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the system performs the switchover operation. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-06T14:11:08Z</p>
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
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li>rds_apsaradb_ha: master-replica switchover</li>
         * <li>rds_apsaradb_transfer: instance migration</li>
         * <li>rds_apsaradb_upgrade: minor version update</li>
         * <li>all: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_ha</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeActiveOperationTaskResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTaskResponseBodyItems self = new DescribeActiveOperationTaskResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTaskResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeActiveOperationTaskResponseBodyItems setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public DescribeActiveOperationTaskResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeActiveOperationTaskResponseBodyItems setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeActiveOperationTaskResponseBodyItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setPrepareInterval(String prepareInterval) {
            this.prepareInterval = prepareInterval;
            return this;
        }
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        public DescribeActiveOperationTaskResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeActiveOperationTaskResponseBodyItems setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeActiveOperationTaskResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeActiveOperationTaskResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeActiveOperationTaskResponseBodyItems setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeActiveOperationTaskResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
