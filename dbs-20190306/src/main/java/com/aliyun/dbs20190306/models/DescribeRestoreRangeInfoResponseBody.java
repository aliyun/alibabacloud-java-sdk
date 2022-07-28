// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreRangeInfoResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public DescribeRestoreRangeInfoResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("EndTime")
        public Long endTime;

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
        @NameInMap("BeginTimestampForRestore")
        public Long beginTimestampForRestore;

        @NameInMap("EndTimestampForRestore")
        public Long endTimestampForRestore;

        @NameInMap("FullBackupList")
        public DescribeRestoreRangeInfoResponseBodyItemsDBSRecoverRangeFullBackupList fullBackupList;

        @NameInMap("RangeType")
        public String rangeType;

        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

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
