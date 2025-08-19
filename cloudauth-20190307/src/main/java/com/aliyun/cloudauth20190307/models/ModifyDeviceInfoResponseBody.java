// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponseBody extends TeaModel {
    /**
     * <p>If the Duration in the request parameters is not empty, this field represents the start time of the authorization after the device validity period has been extended. One year of Duration is calculated as 365 days. Example: 20180101.</p>
     * 
     * <strong>example:</strong>
     * <p>20190401</p>
     */
    @NameInMap("BeginDay")
    public String beginDay;

    /**
     * <p>Corresponds to the BizType in the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_TEST</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Corresponds to the DeviceId in the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>wd.6ziUffspAeW5FVYbaqmexR-1qwNjM</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>If the Duration in the request parameters is not empty, this field represents the expiration time of the authorization after the device validity period has been extended. One year of Duration is calculated as 365 days. Example: 20180101.</p>
     * 
     * <strong>example:</strong>
     * <p>20200330</p>
     */
    @NameInMap("ExpiredDay")
    public String expiredDay;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Corresponds to the UserDeviceId in the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>3iJ1AY$oHcu7mC69</p>
     */
    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static ModifyDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponseBody self = new ModifyDeviceInfoResponseBody();
        return TeaModel.build(map, self);
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

}
