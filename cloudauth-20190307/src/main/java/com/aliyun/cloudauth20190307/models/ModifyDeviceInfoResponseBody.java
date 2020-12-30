// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponseBody extends TeaModel {
    @NameInMap("ExpiredDay")
    public String expiredDay;

    @NameInMap("BeginDay")
    public String beginDay;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static ModifyDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponseBody self = new ModifyDeviceInfoResponseBody();
        return TeaModel.build(map, self);
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

    public ModifyDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDeviceInfoResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ModifyDeviceInfoResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ModifyDeviceInfoResponseBody setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
