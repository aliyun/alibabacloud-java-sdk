// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetBackupResponseBody extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-cad4a85ff5e340388b93</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The time when the backup was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The backup description.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the backup ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the backup was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T19:26:20Z</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-b58c874912fc4294****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The time when the backup started.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T11:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status.</p>
     * <ul>
     * <li><p>Creating: The backup is being created.</p>
     * </li>
     * <li><p>Created: The backup is created.</p>
     * </li>
     * <li><p>CreateFailed: The backup failed to be created.</p>
     * </li>
     * <li><p>Deleting: The backup is being deleted.</p>
     * </li>
     * <li><p>Deleted: The backup is deleted.</p>
     * </li>
     * <li><p>DeleteFailed: The backup failed to be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The detailed status of the deployment instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Disk i-xxxx backup failed, error message: error</p>
     */
    @NameInMap("StatusDetail")
    public String statusDetail;

    public static GetBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupResponseBody self = new GetBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public GetBackupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetBackupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBackupResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBackupResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public GetBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBackupResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetBackupResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetBackupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetBackupResponseBody setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }
    public String getStatusDetail() {
        return this.statusDetail;
    }

}
