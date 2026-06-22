// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDRMLicenseResponseBody extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfo;

    @NameInMap("License")
    public String license;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("States")
    public Long states;

    public static GetDRMLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseResponseBody self = new GetDRMLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseResponseBody setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetDRMLicenseResponseBody setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public GetDRMLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDRMLicenseResponseBody setStates(Long states) {
        this.states = states;
        return this;
    }
    public Long getStates() {
        return this.states;
    }

}
