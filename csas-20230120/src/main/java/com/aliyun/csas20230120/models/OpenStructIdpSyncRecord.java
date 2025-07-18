// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructIdpSyncRecord extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("IdpRawJson")
    public String idpRawJson;

    @NameInMap("IdpResourceId")
    public String idpResourceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecordType")
    public String recordType;

    @NameInMap("SaseRawJson")
    public String saseRawJson;

    @NameInMap("SaseResourceId")
    public String saseResourceId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SyncRecordId")
    public String syncRecordId;

    @NameInMap("SyncTaskId")
    public String syncTaskId;

    @NameInMap("TimeUnix")
    public String timeUnix;

    public static OpenStructIdpSyncRecord build(java.util.Map<String, ?> map) throws Exception {
        OpenStructIdpSyncRecord self = new OpenStructIdpSyncRecord();
        return TeaModel.build(map, self);
    }

    public OpenStructIdpSyncRecord setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OpenStructIdpSyncRecord setIdpRawJson(String idpRawJson) {
        this.idpRawJson = idpRawJson;
        return this;
    }
    public String getIdpRawJson() {
        return this.idpRawJson;
    }

    public OpenStructIdpSyncRecord setIdpResourceId(String idpResourceId) {
        this.idpResourceId = idpResourceId;
        return this;
    }
    public String getIdpResourceId() {
        return this.idpResourceId;
    }

    public OpenStructIdpSyncRecord setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenStructIdpSyncRecord setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public OpenStructIdpSyncRecord setSaseRawJson(String saseRawJson) {
        this.saseRawJson = saseRawJson;
        return this;
    }
    public String getSaseRawJson() {
        return this.saseRawJson;
    }

    public OpenStructIdpSyncRecord setSaseResourceId(String saseResourceId) {
        this.saseResourceId = saseResourceId;
        return this;
    }
    public String getSaseResourceId() {
        return this.saseResourceId;
    }

    public OpenStructIdpSyncRecord setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OpenStructIdpSyncRecord setSyncRecordId(String syncRecordId) {
        this.syncRecordId = syncRecordId;
        return this;
    }
    public String getSyncRecordId() {
        return this.syncRecordId;
    }

    public OpenStructIdpSyncRecord setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public OpenStructIdpSyncRecord setTimeUnix(String timeUnix) {
        this.timeUnix = timeUnix;
        return this;
    }
    public String getTimeUnix() {
        return this.timeUnix;
    }

}
