// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("ExpiredDay")
    public String expiredDay;

    @NameInMap("BeginDay")
    public String beginDay;

    @NameInMap("BizType")
    public String bizType;

    public static ModifyDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponseBody self = new ModifyDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDeviceInfoResponseBody setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public ModifyDeviceInfoResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ModifyDeviceInfoResponseBody setExpiredDay(String expiredDay) {
        this.expiredDay = expiredDay;
        return this;
    }
    public String getExpiredDay() {
        return this.expiredDay;
    }

    public ModifyDeviceInfoResponseBody setBeginDay(String beginDay) {
        this.beginDay = beginDay;
        return this;
    }
    public String getBeginDay() {
        return this.beginDay;
    }

    public ModifyDeviceInfoResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
