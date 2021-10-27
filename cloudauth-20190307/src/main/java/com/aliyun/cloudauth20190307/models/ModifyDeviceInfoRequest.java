// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("ExpiredDay")
    public String expiredDay;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static ModifyDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoRequest self = new ModifyDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ModifyDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ModifyDeviceInfoRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ModifyDeviceInfoRequest setExpiredDay(String expiredDay) {
        this.expiredDay = expiredDay;
        return this;
    }
    public String getExpiredDay() {
        return this.expiredDay;
    }

    public ModifyDeviceInfoRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
