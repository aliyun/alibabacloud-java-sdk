// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("TotalElements")
    public Integer totalElements;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Items")
    public DescribeBackupSetDownloadTaskListResponseBodyItems items;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeBackupSetDownloadTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadTaskListResponseBody self = new DescribeBackupSetDownloadTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadTaskListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setItems(DescribeBackupSetDownloadTaskListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupSetDownloadTaskListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public static class DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail extends TeaModel {
        @NameInMap("BackupSetDownloadStatus")
        public String backupSetDownloadStatus;

        @NameInMap("BackupSetDataSize")
        public Long backupSetDataSize;

        @NameInMap("BackupSetDownloadDir")
        public String backupSetDownloadDir;

        @NameInMap("BackupSetDownloadTargetType")
        public String backupSetDownloadTargetType;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("BackupSetDownloadCreateTime")
        public Long backupSetDownloadCreateTime;

        @NameInMap("BackupSetDbType")
        public String backupSetDbType;

        @NameInMap("BackupSetDownloadInternetUrl")
        public String backupSetDownloadInternetUrl;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        @NameInMap("BackupSetDownloadIntranetUrl")
        public String backupSetDownloadIntranetUrl;

        @NameInMap("BackupSetDownloadWay")
        public String backupSetDownloadWay;

        @NameInMap("BackupSetDownloadFinishTime")
        public Long backupSetDownloadFinishTime;

        @NameInMap("BackupSetJobType")
        public String backupSetJobType;

        @NameInMap("BackupSetDownloadTaskId")
        public String backupSetDownloadTaskId;

        @NameInMap("BackupSetDownloadTaskName")
        public String backupSetDownloadTaskName;

        @NameInMap("BackupSetDataFormat")
        public String backupSetDataFormat;

        @NameInMap("BackupSetCode")
        public String backupSetCode;

        public static DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail self = new DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadStatus(String backupSetDownloadStatus) {
            this.backupSetDownloadStatus = backupSetDownloadStatus;
            return this;
        }
        public String getBackupSetDownloadStatus() {
            return this.backupSetDownloadStatus;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDataSize(Long backupSetDataSize) {
            this.backupSetDataSize = backupSetDataSize;
            return this;
        }
        public Long getBackupSetDataSize() {
            return this.backupSetDataSize;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadDir(String backupSetDownloadDir) {
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadCreateTime(Long backupSetDownloadCreateTime) {
            this.backupSetDownloadCreateTime = backupSetDownloadCreateTime;
            return this;
        }
        public Long getBackupSetDownloadCreateTime() {
            return this.backupSetDownloadCreateTime;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDbType(String backupSetDbType) {
            this.backupSetDbType = backupSetDbType;
            return this;
        }
        public String getBackupSetDbType() {
            return this.backupSetDbType;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadInternetUrl(String backupSetDownloadInternetUrl) {
            this.backupSetDownloadInternetUrl = backupSetDownloadInternetUrl;
            return this;
        }
        public String getBackupSetDownloadInternetUrl() {
            return this.backupSetDownloadInternetUrl;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadIntranetUrl(String backupSetDownloadIntranetUrl) {
            this.backupSetDownloadIntranetUrl = backupSetDownloadIntranetUrl;
            return this;
        }
        public String getBackupSetDownloadIntranetUrl() {
            return this.backupSetDownloadIntranetUrl;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadWay(String backupSetDownloadWay) {
            this.backupSetDownloadWay = backupSetDownloadWay;
            return this;
        }
        public String getBackupSetDownloadWay() {
            return this.backupSetDownloadWay;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadFinishTime(Long backupSetDownloadFinishTime) {
            this.backupSetDownloadFinishTime = backupSetDownloadFinishTime;
            return this;
        }
        public Long getBackupSetDownloadFinishTime() {
            return this.backupSetDownloadFinishTime;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetJobType(String backupSetJobType) {
            this.backupSetJobType = backupSetJobType;
            return this;
        }
        public String getBackupSetJobType() {
            return this.backupSetJobType;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadTaskId(String backupSetDownloadTaskId) {
            this.backupSetDownloadTaskId = backupSetDownloadTaskId;
            return this;
        }
        public String getBackupSetDownloadTaskId() {
            return this.backupSetDownloadTaskId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadTaskName(String backupSetDownloadTaskName) {
            this.backupSetDownloadTaskName = backupSetDownloadTaskName;
            return this;
        }
        public String getBackupSetDownloadTaskName() {
            return this.backupSetDownloadTaskName;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDataFormat(String backupSetDataFormat) {
            this.backupSetDataFormat = backupSetDataFormat;
            return this;
        }
        public String getBackupSetDataFormat() {
            return this.backupSetDataFormat;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetCode(String backupSetCode) {
            this.backupSetCode = backupSetCode;
            return this;
        }
        public String getBackupSetCode() {
            return this.backupSetCode;
        }

    }

    public static class DescribeBackupSetDownloadTaskListResponseBodyItems extends TeaModel {
        @NameInMap("BackupSetDownloadTaskDetail")
        public java.util.List<DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail> backupSetDownloadTaskDetail;

        public static DescribeBackupSetDownloadTaskListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetDownloadTaskListResponseBodyItems self = new DescribeBackupSetDownloadTaskListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItems setBackupSetDownloadTaskDetail(java.util.List<DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail> backupSetDownloadTaskDetail) {
            this.backupSetDownloadTaskDetail = backupSetDownloadTaskDetail;
            return this;
        }
        public java.util.List<DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail> getBackupSetDownloadTaskDetail() {
            return this.backupSetDownloadTaskDetail;
        }

    }

}
