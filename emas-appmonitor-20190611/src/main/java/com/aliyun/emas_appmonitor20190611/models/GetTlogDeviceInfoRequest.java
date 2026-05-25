// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>ad-0008ane9g0qcyu90bpm1-829</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    public static GetTlogDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceInfoRequest self = new GetTlogDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceInfoRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetTlogDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetTlogDeviceInfoRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

}
