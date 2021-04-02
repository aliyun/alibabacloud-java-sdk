// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MFADevice")
    @Validation(required = true)
    public UnbindMFADeviceResponseMFADevice MFADevice;

    public static UnbindMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceResponse self = new UnbindMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindMFADeviceResponse setMFADevice(UnbindMFADeviceResponseMFADevice MFADevice) {
        this.MFADevice = MFADevice;
        return this;
    }
    public UnbindMFADeviceResponseMFADevice getMFADevice() {
        return this.MFADevice;
    }

    public static class UnbindMFADeviceResponseMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        public static UnbindMFADeviceResponseMFADevice build(java.util.Map<String, ?> map) throws Exception {
            UnbindMFADeviceResponseMFADevice self = new UnbindMFADeviceResponseMFADevice();
            return TeaModel.build(map, self);
        }

        public UnbindMFADeviceResponseMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
