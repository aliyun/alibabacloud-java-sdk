// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListResponseBody extends TeaModel {
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
     * <p>The details of the backup schedules.</p>
     */
    @NameInMap("Items")
    public DescribeBackupSetDownloadTaskListResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>6DC3D286-E0E6-5988-A558-2184984B****</p>
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

    /**
     * <p>The total number of backup set download tasks.</p>
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

    public static DescribeBackupSetDownloadTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadTaskListResponseBody self = new DescribeBackupSetDownloadTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadTaskListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setItems(DescribeBackupSetDownloadTaskListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupSetDownloadTaskListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetDownloadTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail extends TeaModel {
        /**
         * <p>The backup gateway that is used to download the backup set. This parameter is available only if the value of the BackupSetDownloadWay parameter is auto.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        /**
         * <p>The ID of the backup schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>qhnuhyw3****</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>The code of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-bin.00XXXX</p>
         */
        @NameInMap("BackupSetCode")
        public String backupSetCode;

        /**
         * <p>The format in which the backup set is downloaded. Valid values:</p>
         * <ul>
         * <li><strong>Native</strong></li>
         * <li><strong>SQL</strong></li>
         * <li><strong>CSV</strong></li>
         * <li><strong>JSON</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Native</p>
         */
        @NameInMap("BackupSetDataFormat")
        public String backupSetDataFormat;

        /**
         * <p>The size of the data in the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>237837</p>
         */
        @NameInMap("BackupSetDataSize")
        public Long backupSetDataSize;

        /**
         * <p>The type of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("BackupSetDbType")
        public String backupSetDbType;

        /**
         * <p>The timestamp that indicates when the backup set download task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1642044001000</p>
         */
        @NameInMap("BackupSetDownloadCreateTime")
        public Long backupSetDownloadCreateTime;

        /**
         * <p>The server directory to which the backup set is downloaded.</p>
         * <blockquote>
         * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is auto.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("BackupSetDownloadDir")
        public String backupSetDownloadDir;

        /**
         * <p>The timestamp that indicates when the backup set download task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1642044013000</p>
         */
        @NameInMap("BackupSetDownloadFinishTime")
        public Long backupSetDownloadFinishTime;

        /**
         * <p>The public download URL of the backup set.</p>
         * <blockquote>
         * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is manual and the conversion is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;//dbs-137XXXX-cn-hangzhou-1hr5cpbtmXXXX.oss-cn-hangzhou.example&quot;</p>
         */
        @NameInMap("BackupSetDownloadInternetUrl")
        public String backupSetDownloadInternetUrl;

        /**
         * <p>The internal download URL of the backup set.</p>
         * <blockquote>
         * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is manual and the conversion is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;//dbs-13XXXX-cn-hangzhou-1hr5cpbtmXXXX.oss-cn-hangzhou-internal.example&quot;</p>
         */
        @NameInMap("BackupSetDownloadIntranetUrl")
        public String backupSetDownloadIntranetUrl;

        /**
         * <p>The status of the backup set download task. Valid values:</p>
         * <ul>
         * <li><strong>checking</strong>: The backup set download task is being prechecked.</li>
         * <li><strong>init</strong>: The backup set download task is not started and fails to pass the precheck.</li>
         * <li><strong>check_pass</strong>: The backup set download task passes the precheck.</li>
         * <li><strong>pause</strong>: The backup set download task is paused.</li>
         * <li><strong>schedule</strong>: The backup set download task is waiting to be scheduled</li>
         * <li><strong>running</strong>: The backup set download task is running.</li>
         * <li><strong>stop</strong>: The backup set download task fails.</li>
         * <li><strong>finish</strong>: The backup set download task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("BackupSetDownloadStatus")
        public String backupSetDownloadStatus;

        /**
         * <p>The type of the destination server to which the backup set is downloaded.</p>
         * <blockquote>
         * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is auto. A value of agent indicates a server on which a backup gateway is installed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("BackupSetDownloadTargetType")
        public String backupSetDownloadTargetType;

        /**
         * <p>The ID of the backup set download task.</p>
         * 
         * <strong>example:</strong>
         * <p>urxgrxt7****</p>
         */
        @NameInMap("BackupSetDownloadTaskId")
        public String backupSetDownloadTaskId;

        /**
         * <p>The name of the backup set download task.</p>
         * 
         * <strong>example:</strong>
         * <p>1h7za2yws****-ManualCont</p>
         */
        @NameInMap("BackupSetDownloadTaskName")
        public String backupSetDownloadTaskName;

        /**
         * <p>The method in which the backup set is downloaded. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: The backup set is manually downloaded.</li>
         * <li><strong>auto</strong>: The backup set is automatically downloaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("BackupSetDownloadWay")
        public String backupSetDownloadWay;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>1h7za2yws****</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The type of the backup set task. Valid values:</p>
         * <ul>
         * <li><strong>cbs_backup_sub_full</strong>: logical full backup set download task</li>
         * <li><strong>cbs_backup_sub_cont</strong>: logical incremental backup set download task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cbs_backup_sub_cont</p>
         */
        @NameInMap("BackupSetJobType")
        public String backupSetJobType;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.IndexOutOfBoundsException.</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        public static DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail self = new DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetCode(String backupSetCode) {
            this.backupSetCode = backupSetCode;
            return this;
        }
        public String getBackupSetCode() {
            return this.backupSetCode;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDataFormat(String backupSetDataFormat) {
            this.backupSetDataFormat = backupSetDataFormat;
            return this;
        }
        public String getBackupSetDataFormat() {
            return this.backupSetDataFormat;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDataSize(Long backupSetDataSize) {
            this.backupSetDataSize = backupSetDataSize;
            return this;
        }
        public Long getBackupSetDataSize() {
            return this.backupSetDataSize;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDbType(String backupSetDbType) {
            this.backupSetDbType = backupSetDbType;
            return this;
        }
        public String getBackupSetDbType() {
            return this.backupSetDbType;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadCreateTime(Long backupSetDownloadCreateTime) {
            this.backupSetDownloadCreateTime = backupSetDownloadCreateTime;
            return this;
        }
        public Long getBackupSetDownloadCreateTime() {
            return this.backupSetDownloadCreateTime;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadDir(String backupSetDownloadDir) {
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadFinishTime(Long backupSetDownloadFinishTime) {
            this.backupSetDownloadFinishTime = backupSetDownloadFinishTime;
            return this;
        }
        public Long getBackupSetDownloadFinishTime() {
            return this.backupSetDownloadFinishTime;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadInternetUrl(String backupSetDownloadInternetUrl) {
            this.backupSetDownloadInternetUrl = backupSetDownloadInternetUrl;
            return this;
        }
        public String getBackupSetDownloadInternetUrl() {
            return this.backupSetDownloadInternetUrl;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadIntranetUrl(String backupSetDownloadIntranetUrl) {
            this.backupSetDownloadIntranetUrl = backupSetDownloadIntranetUrl;
            return this;
        }
        public String getBackupSetDownloadIntranetUrl() {
            return this.backupSetDownloadIntranetUrl;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadStatus(String backupSetDownloadStatus) {
            this.backupSetDownloadStatus = backupSetDownloadStatus;
            return this;
        }
        public String getBackupSetDownloadStatus() {
            return this.backupSetDownloadStatus;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
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

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetDownloadWay(String backupSetDownloadWay) {
            this.backupSetDownloadWay = backupSetDownloadWay;
            return this;
        }
        public String getBackupSetDownloadWay() {
            return this.backupSetDownloadWay;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setBackupSetJobType(String backupSetJobType) {
            this.backupSetJobType = backupSetJobType;
            return this;
        }
        public String getBackupSetJobType() {
            return this.backupSetJobType;
        }

        public DescribeBackupSetDownloadTaskListResponseBodyItemsBackupSetDownloadTaskDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
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
