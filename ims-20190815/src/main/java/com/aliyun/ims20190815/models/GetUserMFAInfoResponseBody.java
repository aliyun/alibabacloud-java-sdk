// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponseBody extends TeaModel {
    @NameInMap("MFADevice")
    public GetUserMFAInfoResponseBodyMFADevice MFADevice;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsMFAEnable")
    public Boolean isMFAEnable;

    public static GetUserMFAInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponseBody self = new GetUserMFAInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponseBody setMFADevice(GetUserMFAInfoResponseBodyMFADevice MFADevice) {
        this.MFADevice = MFADevice;
        return this;
    }
    public GetUserMFAInfoResponseBodyMFADevice getMFADevice() {
        return this.MFADevice;
    }

    public GetUserMFAInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserMFAInfoResponseBody setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    public static class GetUserMFAInfoResponseBodyMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static GetUserMFAInfoResponseBodyMFADevice build(java.util.Map<String, ?> map) throws Exception {
            GetUserMFAInfoResponseBodyMFADevice self = new GetUserMFAInfoResponseBodyMFADevice();
            return TeaModel.build(map, self);
        }

        public GetUserMFAInfoResponseBodyMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
