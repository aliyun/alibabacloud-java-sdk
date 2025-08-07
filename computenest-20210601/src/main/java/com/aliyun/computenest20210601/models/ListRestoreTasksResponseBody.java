// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListRestoreTasksResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>464C8CB6-A548-5206-B83C-D32A8E43EC21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of restore tasks.</p>
     */
    @NameInMap("RestoreTasks")
    public java.util.List<ListRestoreTasksResponseBodyRestoreTasks> restoreTasks;

    /**
     * <p>Total data count under the current request conditions (optional; not returned by default).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRestoreTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRestoreTasksResponseBody self = new ListRestoreTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRestoreTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRestoreTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRestoreTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRestoreTasksResponseBody setRestoreTasks(java.util.List<ListRestoreTasksResponseBodyRestoreTasks> restoreTasks) {
        this.restoreTasks = restoreTasks;
        return this;
    }
    public java.util.List<ListRestoreTasksResponseBodyRestoreTasks> getRestoreTasks() {
        return this.restoreTasks;
    }

    public ListRestoreTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRestoreTasksResponseBodyRestoreTasks extends TeaModel {
        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-728f128bf92c4e3da970</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-07T11:37:37Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-27T18:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-07T12:16:16Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the restore task.</p>
         * 
         * <strong>example:</strong>
         * <p>restore-xxxxxx</p>
         */
        @NameInMap("RestoreTaskId")
        public String restoreTaskId;

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-8c367c27c84e44a79d36</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The time when the update started.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-27T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the service instance. Valid values:</p>
         * <ul>
         * <li>Restoring</li>
         * <li>Restored</li>
         * <li>RestoreFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Restoring</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the service instance deployment information.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxx  failed, error message: error</p>
         */
        @NameInMap("StatusDetail")
        public String statusDetail;

        public static ListRestoreTasksResponseBodyRestoreTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRestoreTasksResponseBodyRestoreTasks self = new ListRestoreTasksResponseBodyRestoreTasks();
            return TeaModel.build(map, self);
        }

        public ListRestoreTasksResponseBodyRestoreTasks setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setRestoreTaskId(String restoreTaskId) {
            this.restoreTaskId = restoreTaskId;
            return this;
        }
        public String getRestoreTaskId() {
            return this.restoreTaskId;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRestoreTasksResponseBodyRestoreTasks setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

    }

}
