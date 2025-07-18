// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructIdpSyncTask extends TeaModel {
    @NameInMap("DepartmentFailed")
    public Long departmentFailed;

    @NameInMap("DepartmentTotal")
    public Long departmentTotal;

    @NameInMap("EndTimeUnix")
    public Long endTimeUnix;

    @NameInMap("FailType")
    public String failType;

    @NameInMap("IdpConfigId")
    public byte[] idpConfigId;

    @NameInMap("StartTimeUnix")
    public Long startTimeUnix;

    @NameInMap("Status")
    public String status;

    @NameInMap("SyncTaskId")
    public String syncTaskId;

    @NameInMap("UpdateTimeUnix")
    public Long updateTimeUnix;

    @NameInMap("UserFailed")
    public Long userFailed;

    @NameInMap("UserTotal")
    public Long userTotal;

    public static OpenStructIdpSyncTask build(java.util.Map<String, ?> map) throws Exception {
        OpenStructIdpSyncTask self = new OpenStructIdpSyncTask();
        return TeaModel.build(map, self);
    }

    public OpenStructIdpSyncTask setDepartmentFailed(Long departmentFailed) {
        this.departmentFailed = departmentFailed;
        return this;
    }
    public Long getDepartmentFailed() {
        return this.departmentFailed;
    }

    public OpenStructIdpSyncTask setDepartmentTotal(Long departmentTotal) {
        this.departmentTotal = departmentTotal;
        return this;
    }
    public Long getDepartmentTotal() {
        return this.departmentTotal;
    }

    public OpenStructIdpSyncTask setEndTimeUnix(Long endTimeUnix) {
        this.endTimeUnix = endTimeUnix;
        return this;
    }
    public Long getEndTimeUnix() {
        return this.endTimeUnix;
    }

    public OpenStructIdpSyncTask setFailType(String failType) {
        this.failType = failType;
        return this;
    }
    public String getFailType() {
        return this.failType;
    }

    public OpenStructIdpSyncTask setIdpConfigId(byte[] idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public byte[] getIdpConfigId() {
        return this.idpConfigId;
    }

    public OpenStructIdpSyncTask setStartTimeUnix(Long startTimeUnix) {
        this.startTimeUnix = startTimeUnix;
        return this;
    }
    public Long getStartTimeUnix() {
        return this.startTimeUnix;
    }

    public OpenStructIdpSyncTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpenStructIdpSyncTask setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public OpenStructIdpSyncTask setUpdateTimeUnix(Long updateTimeUnix) {
        this.updateTimeUnix = updateTimeUnix;
        return this;
    }
    public Long getUpdateTimeUnix() {
        return this.updateTimeUnix;
    }

    public OpenStructIdpSyncTask setUserFailed(Long userFailed) {
        this.userFailed = userFailed;
        return this;
    }
    public Long getUserFailed() {
        return this.userFailed;
    }

    public OpenStructIdpSyncTask setUserTotal(Long userTotal) {
        this.userTotal = userTotal;
        return this;
    }
    public Long getUserTotal() {
        return this.userTotal;
    }

}
