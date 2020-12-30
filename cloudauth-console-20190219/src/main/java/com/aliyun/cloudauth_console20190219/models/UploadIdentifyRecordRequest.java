// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UploadIdentifyRecordRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IdentifyingImageBase64")
    public String identifyingImageBase64;

    @NameInMap("IdentifyingTime")
    public Long identifyingTime;

    @NameInMap("IdentifyingImageUrl")
    public String identifyingImageUrl;

    @NameInMap("DeviceName")
    public String deviceName;

    public static UploadIdentifyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIdentifyRecordRequest self = new UploadIdentifyRecordRequest();
        return TeaModel.build(map, self);
    }

    public UploadIdentifyRecordRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadIdentifyRecordRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UploadIdentifyRecordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UploadIdentifyRecordRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UploadIdentifyRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UploadIdentifyRecordRequest setIdentifyingImageBase64(String identifyingImageBase64) {
        this.identifyingImageBase64 = identifyingImageBase64;
        return this;
    }
    public String getIdentifyingImageBase64() {
        return this.identifyingImageBase64;
    }

    public UploadIdentifyRecordRequest setIdentifyingTime(Long identifyingTime) {
        this.identifyingTime = identifyingTime;
        return this;
    }
    public Long getIdentifyingTime() {
        return this.identifyingTime;
    }

    public UploadIdentifyRecordRequest setIdentifyingImageUrl(String identifyingImageUrl) {
        this.identifyingImageUrl = identifyingImageUrl;
        return this;
    }
    public String getIdentifyingImageUrl() {
        return this.identifyingImageUrl;
    }

    public UploadIdentifyRecordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
