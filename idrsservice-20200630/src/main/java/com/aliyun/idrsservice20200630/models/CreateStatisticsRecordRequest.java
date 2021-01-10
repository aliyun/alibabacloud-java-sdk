// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateStatisticsRecordRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeviceType")
    public Integer deviceType;

    @NameInMap("BeginAt")
    public String beginAt;

    @NameInMap("EndAt")
    public String endAt;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateStatisticsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStatisticsRecordRequest self = new CreateStatisticsRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateStatisticsRecordRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateStatisticsRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateStatisticsRecordRequest setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public Integer getDeviceType() {
        return this.deviceType;
    }

    public CreateStatisticsRecordRequest setBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }
    public String getBeginAt() {
        return this.beginAt;
    }

    public CreateStatisticsRecordRequest setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public CreateStatisticsRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
