// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateDRMLicenseResponseBody extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfo;

    @NameInMap("License")
    public String license;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("States")
    public Long states;

    public static GenerateDRMLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDRMLicenseResponseBody self = new GenerateDRMLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDRMLicenseResponseBody setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public GenerateDRMLicenseResponseBody setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public GenerateDRMLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDRMLicenseResponseBody setStates(Long states) {
        this.states = states;
        return this;
    }
    public Long getStates() {
        return this.states;
    }

}
