// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backup schedule.</p>
     */
    @NameInMap("Items")
    public DescribeRestoreTaskListResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C397502-B4F2-4E22-AD97-C81F0049F3F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of restore tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalElements")
    public Integer totalElements;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeRestoreTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskListResponseBody self = new DescribeRestoreTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeRestoreTaskListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeRestoreTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRestoreTaskListResponseBody setItems(DescribeRestoreTaskListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRestoreTaskListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRestoreTaskListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRestoreTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRestoreTaskListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeRestoreTaskListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail extends TeaModel {
        /**
         * <p>The ID of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>324234332</p>
         */
        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        /**
         * <p>The ID of the backup schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1hvb0wXXXX</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>The ID of the full backup set that is used in the restore task.</p>
         * 
         * <strong>example:</strong>
         * <p>1ibh2f5uXXX</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The restore progress of the incremental log files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ContinuousRestoreProgress")
        public Integer continuousRestoreProgress;

        /**
         * <p>The unique ID (UID) of the Alibaba Cloud account to which the backup schedule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxx7778xxxxxxxxxx</p>
         */
        @NameInMap("CrossAliyunId")
        public String crossAliyunId;

        /**
         * <p>The name of the RAM role that can be used to perform backups across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("CrossRoleName")
        public String crossRoleName;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DestinationEndpointDatabaseName")
        public String destinationEndpointDatabaseName;

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1p8c2947XXX</p>
         */
        @NameInMap("DestinationEndpointInstanceID")
        public String destinationEndpointInstanceID;

        /**
         * <p>The location of the database. Valid values:</p>
         * <ul>
         * <li>RDS</li>
         * <li>ECS</li>
         * <li>Express: The database is connected to DBS by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
         * <li>Agent: The database is connected to DBS over a DBS backup gateway.</li>
         * <li>DDS: The database is an ApsaraDB for MongoDB database.</li>
         * <li>Other: The database is connected to DBS by using the IP address and port of the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DestinationEndpointInstanceType")
        public String destinationEndpointInstanceType;

        /**
         * <p>The endpoint that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>100.X.X.10:33204</p>
         */
        @NameInMap("DestinationEndpointIpPort")
        public String destinationEndpointIpPort;

        /**
         * <p>The SID of the Oracle database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DestinationEndpointOracleSID")
        public String destinationEndpointOracleSID;

        /**
         * <p>The region in which the database is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestinationEndpointRegion")
        public String destinationEndpointRegion;

        /**
         * <p>The username of the account that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DestinationEndpointUserName")
        public String destinationEndpointUserName;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The restore progress of the full backup data.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FullDataRestoreProgress")
        public Integer fullDataRestoreProgress;

        /**
         * <p>The progress of schema restore after full data restore.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FullStruAfterRestoreProgress")
        public Integer fullStruAfterRestoreProgress;

        /**
         * <p>The progress of schema restore before full data restore.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FullStruforeRestoreProgress")
        public Integer fullStruforeRestoreProgress;

        /**
         * <p>The directory of the destination database to which the objects were restored.</p>
         * 
         * <strong>example:</strong>
         * <p>100.X.X.10:33204</p>
         */
        @NameInMap("RestoreDir")
        public String restoreDir;

        /**
         * <p>The objects to be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>[     {         \&quot;DBName\&quot;:\&quot;test\&quot;       } ]</p>
         */
        @NameInMap("RestoreObjects")
        public String restoreObjects;

        /**
         * <p>The status of the restore task. Valid values:</p>
         * <ul>
         * <li>init: The restore task is not started or does not pass the precheck.</li>
         * <li>running: The restore task is running.</li>
         * <li>stop: The restore task failed.</li>
         * <li>pause: The restore task is stopped.</li>
         * <li>check_pass: The restore task passed the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The time when the restore task was created, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("RestoreTaskCreateTime")
        public Long restoreTaskCreateTime;

        /**
         * <p>The time when the restore task was complete, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("RestoreTaskFinishTime")
        public Long restoreTaskFinishTime;

        /**
         * <p>The ID of the restore task.</p>
         * 
         * <strong>example:</strong>
         * <p>s1XXXXXX</p>
         */
        @NameInMap("RestoreTaskId")
        public String restoreTaskId;

        /**
         * <p>The name of the restore task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RestoreTaskName")
        public String restoreTaskName;

        /**
         * <p>The time to run the restore task, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("RestoreTime")
        public Long restoreTime;

        public static DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail self = new DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setContinuousRestoreProgress(Integer continuousRestoreProgress) {
            this.continuousRestoreProgress = continuousRestoreProgress;
            return this;
        }
        public Integer getContinuousRestoreProgress() {
            return this.continuousRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setCrossAliyunId(String crossAliyunId) {
            this.crossAliyunId = crossAliyunId;
            return this;
        }
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setCrossRoleName(String crossRoleName) {
            this.crossRoleName = crossRoleName;
            return this;
        }
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }
        public String getDestinationEndpointDatabaseName() {
            return this.destinationEndpointDatabaseName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }
        public String getDestinationEndpointInstanceID() {
            return this.destinationEndpointInstanceID;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }
        public String getDestinationEndpointInstanceType() {
            return this.destinationEndpointInstanceType;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointIpPort(String destinationEndpointIpPort) {
            this.destinationEndpointIpPort = destinationEndpointIpPort;
            return this;
        }
        public String getDestinationEndpointIpPort() {
            return this.destinationEndpointIpPort;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }
        public String getDestinationEndpointOracleSID() {
            return this.destinationEndpointOracleSID;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointRegion(String destinationEndpointRegion) {
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }
        public String getDestinationEndpointRegion() {
            return this.destinationEndpointRegion;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setDestinationEndpointUserName(String destinationEndpointUserName) {
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }
        public String getDestinationEndpointUserName() {
            return this.destinationEndpointUserName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullDataRestoreProgress(Integer fullDataRestoreProgress) {
            this.fullDataRestoreProgress = fullDataRestoreProgress;
            return this;
        }
        public Integer getFullDataRestoreProgress() {
            return this.fullDataRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
            this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
            return this;
        }
        public Integer getFullStruAfterRestoreProgress() {
            return this.fullStruAfterRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setFullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
            this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
            return this;
        }
        public Integer getFullStruforeRestoreProgress() {
            return this.fullStruforeRestoreProgress;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreDir(String restoreDir) {
            this.restoreDir = restoreDir;
            return this;
        }
        public String getRestoreDir() {
            return this.restoreDir;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreObjects(String restoreObjects) {
            this.restoreObjects = restoreObjects;
            return this;
        }
        public String getRestoreObjects() {
            return this.restoreObjects;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskCreateTime(Long restoreTaskCreateTime) {
            this.restoreTaskCreateTime = restoreTaskCreateTime;
            return this;
        }
        public Long getRestoreTaskCreateTime() {
            return this.restoreTaskCreateTime;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskFinishTime(Long restoreTaskFinishTime) {
            this.restoreTaskFinishTime = restoreTaskFinishTime;
            return this;
        }
        public Long getRestoreTaskFinishTime() {
            return this.restoreTaskFinishTime;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskId(String restoreTaskId) {
            this.restoreTaskId = restoreTaskId;
            return this;
        }
        public String getRestoreTaskId() {
            return this.restoreTaskId;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTaskName(String restoreTaskName) {
            this.restoreTaskName = restoreTaskName;
            return this;
        }
        public String getRestoreTaskName() {
            return this.restoreTaskName;
        }

        public DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail setRestoreTime(Long restoreTime) {
            this.restoreTime = restoreTime;
            return this;
        }
        public Long getRestoreTime() {
            return this.restoreTime;
        }

    }

    public static class DescribeRestoreTaskListResponseBodyItems extends TeaModel {
        @NameInMap("RestoreTaskDetail")
        public java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> restoreTaskDetail;

        public static DescribeRestoreTaskListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTaskListResponseBodyItems self = new DescribeRestoreTaskListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTaskListResponseBodyItems setRestoreTaskDetail(java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> restoreTaskDetail) {
            this.restoreTaskDetail = restoreTaskDetail;
            return this;
        }
        public java.util.List<DescribeRestoreTaskListResponseBodyItemsRestoreTaskDetail> getRestoreTaskDetail() {
            return this.restoreTaskDetail;
        }

    }

}
