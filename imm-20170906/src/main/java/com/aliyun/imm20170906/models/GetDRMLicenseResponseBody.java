// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetDRMLicenseResponseBody extends TeaModel {
    @NameInMap("DRMData")
    public String DRMData;

    @NameInMap("DeviceInfo")
    public String deviceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDRMLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseResponseBody self = new GetDRMLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseResponseBody setDRMData(String DRMData) {
        this.DRMData = DRMData;
        return this;
    }
    public String getDRMData() {
        return this.DRMData;
    }

    public GetDRMLicenseResponseBody setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetDRMLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
