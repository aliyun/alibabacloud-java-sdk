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
     * <p>The creation time of the backup task.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
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
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The update time of the backup task.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-b58c874912fc4294****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The start time of the backup task.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T11:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the backup task.</p>
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
     * <p>The description of the deployment instance status.</p>
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
