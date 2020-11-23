// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VirtualMFADevice")
    @Validation(required = true)
    public CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice;

    public static CreateVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponse self = new CreateVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualMFADeviceResponse setVirtualMFADevice(CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
        return this;
    }
    public CreateVirtualMFADeviceResponseVirtualMFADevice getVirtualMFADevice() {
        return this.virtualMFADevice;
    }

    public static class CreateVirtualMFADeviceResponseVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("Base32StringSeed")
        @Validation(required = true)
        public String base32StringSeed;

        @NameInMap("QRCodePNG")
        @Validation(required = true)
        public String QRCodePNG;

        public static CreateVirtualMFADeviceResponseVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualMFADeviceResponseVirtualMFADevice self = new CreateVirtualMFADeviceResponseVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public CreateVirtualMFADeviceResponseVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public CreateVirtualMFADeviceResponseVirtualMFADevice setBase32StringSeed(String base32StringSeed) {
            this.base32StringSeed = base32StringSeed;
            return this;
        }
        public String getBase32StringSeed() {
            return this.base32StringSeed;
        }

        public CreateVirtualMFADeviceResponseVirtualMFADevice setQRCodePNG(String QRCodePNG) {
            this.QRCodePNG = QRCodePNG;
            return this;
        }
        public String getQRCodePNG() {
            return this.QRCodePNG;
        }

    }

}
