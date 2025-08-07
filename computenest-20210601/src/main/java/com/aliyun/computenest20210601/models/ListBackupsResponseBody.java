// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListBackupsResponseBody extends TeaModel {
    /**
     * <p>The details of the backup.</p>
     */
    @NameInMap("Backups")
    public java.util.List<ListBackupsResponseBodyBackups> backups;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYoaeZA6xVdkCrmG9EmGshtmECUGpq9Qm7x5vQkpz9NXH0XzUc9t4Kxaf3UtuPY4a0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BB58FE53-ED8F-5D12-9746-CD3A5F463D95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total data count under the current request conditions (optional; not returned by default).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsResponseBody self = new ListBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupsResponseBody setBackups(java.util.List<ListBackupsResponseBodyBackups> backups) {
        this.backups = backups;
        return this;
    }
    public java.util.List<ListBackupsResponseBodyBackups> getBackups() {
        return this.backups;
    }

    public ListBackupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBackupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBackupsResponseBodyBackups extends TeaModel {
        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-4e13aa8ca6a34150addd</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Manual</strong>: manual backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-03T19:54:38+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-15T02:24:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-03T19:54:38+08:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Retention Days. Resources will be cleared upon expiration. Defaults to no expiration if left blank.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-7b6138dfce1e4c41ab71</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The start time of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the backup task. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Created</li>
         * <li>CreateFailed</li>
         * <li>Deleting</li>
         * <li>Deleted</li>
         * <li>DeleteFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the service instance deployment information.</p>
         * 
         * <strong>example:</strong>
         * <p>Disk i-xxxx backup failed, error message: error</p>
         */
        @NameInMap("StatusDetail")
        public String statusDetail;

        public static ListBackupsResponseBodyBackups build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsResponseBodyBackups self = new ListBackupsResponseBodyBackups();
            return TeaModel.build(map, self);
        }

        public ListBackupsResponseBodyBackups setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListBackupsResponseBodyBackups setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public ListBackupsResponseBodyBackups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBackupsResponseBodyBackups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBackupsResponseBodyBackups setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBackupsResponseBodyBackups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListBackupsResponseBodyBackups setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public ListBackupsResponseBodyBackups setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListBackupsResponseBodyBackups setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBackupsResponseBodyBackups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBackupsResponseBodyBackups setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

    }

}
