// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoResponseBody extends TeaModel {
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
     * <p>The information about the time ranges to which you can restore data.</p>
     */
    @NameInMap("Items")
    public DescribeRestoreRangeInfoResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E2BD9DFC-6760-5F49-97C5-DA739E29****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRestoreRangeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreRangeInfoResponseBody self = new DescribeRestoreRangeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreRangeInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeRestoreRangeInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeRestoreRangeInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRestoreRangeInfoResponseBody setItems(DescribeRestoreRangeInfoResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRestoreRangeInfoResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRestoreRangeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreRangeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail extends TeaModel {
        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>qecnsxkd****</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The end time of the full backup task. Example: 1646760308000.</p>
         * 
         * <strong>example:</strong>
         * <p>1646760308000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the full backup task. Example: 1646760282000.</p>
         * 
         * <strong>example:</strong>
         * <p>1646760282000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail self = new DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList extends TeaModel {
        @NameInMap("FullBackupDetail")
        public java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail> fullBackupDetail;

        public static DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList self = new DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList setFullBackupDetail(java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail> fullBackupDetail) {
            this.fullBackupDetail = fullBackupDetail;
            return this;
        }
        public java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupListFullBackupDetail> getFullBackupDetail() {
            return this.fullBackupDetail;
        }

    }

    public static class DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange extends TeaModel {
        /**
         * <p>The beginning of the time range to which you can restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>1646760282000</p>
         */
        @NameInMap("BeginTimestampForRestore")
        public Long beginTimestampForRestore;

        /**
         * <p>The end of the time range to which you can restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>1646760308000</p>
         */
        @NameInMap("EndTimestampForRestore")
        public Long endTimestampForRestore;

        /**
         * <p>If the value of the RangeType parameter is point, this parameter is returned. The value of this parameter describes information about all backup points in the time range.</p>
         */
        @NameInMap("FullBackupList")
        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList fullBackupList;

        /**
         * <p>The type of the time range to which you can restore data.</p>
         * <ul>
         * <li><strong>point</strong>: The time range contains discrete points in time at which full backups were performed.</li>
         * <li><strong>range</strong>: The time range is a period of time for which continuous backup is performed. You can specify a random point in time in the time range to restore data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>point</p>
         */
        @NameInMap("RangeType")
        public String rangeType;

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp106x9tk2c91****</p>
         */
        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

        /**
         * <p>The location of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("SourceEndpointInstanceType")
        public String sourceEndpointInstanceType;

        public static DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange self = new DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setBeginTimestampForRestore(Long beginTimestampForRestore) {
            this.beginTimestampForRestore = beginTimestampForRestore;
            return this;
        }
        public Long getBeginTimestampForRestore() {
            return this.beginTimestampForRestore;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setEndTimestampForRestore(Long endTimestampForRestore) {
            this.endTimestampForRestore = endTimestampForRestore;
            return this;
        }
        public Long getEndTimestampForRestore() {
            return this.endTimestampForRestore;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setFullBackupList(DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList fullBackupList) {
            this.fullBackupList = fullBackupList;
            return this;
        }
        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList getFullBackupList() {
            return this.fullBackupList;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setRangeType(String rangeType) {
            this.rangeType = rangeType;
            return this;
        }
        public String getRangeType() {
            return this.rangeType;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

    }

    public static class DescribeRestoreRangeInfoResponseBodyItems extends TeaModel {
        @NameInMap("DBSRecoverRange")
        public java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange> DBSRecoverRange;

        public static DescribeRestoreRangeInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreRangeInfoResponseBodyItems self = new DescribeRestoreRangeInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreRangeInfoResponseBodyItems setDBSRecoverRange(java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange> DBSRecoverRange) {
            this.DBSRecoverRange = DBSRecoverRange;
            return this;
        }
        public java.util.List<DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRange> getDBSRecoverRange() {
            return this.DBSRecoverRange;
        }

    }

}
