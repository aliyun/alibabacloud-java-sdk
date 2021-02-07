// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponseBody extends TeaModel {
    @NameInMap("VirtualMFADevice")
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponseBody self = new CreateVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceResponseBody setVirtualMFADevice(CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
        return this;
    }
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice getVirtualMFADevice() {
        return this.virtualMFADevice;
    }

    public CreateVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVirtualMFADeviceResponseBodyVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("QRCodePNG")
        public String QRCodePNG;

        @NameInMap("Base32StringSeed")
        public String base32StringSeed;

        public static CreateVirtualMFADeviceResponseBodyVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualMFADeviceResponseBodyVirtualMFADevice self = new CreateVirtualMFADeviceResponseBodyVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setQRCodePNG(String QRCodePNG) {
            this.QRCodePNG = QRCodePNG;
            return this;
        }
        public String getQRCodePNG() {
            return this.QRCodePNG;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setBase32StringSeed(String base32StringSeed) {
            this.base32StringSeed = base32StringSeed;
            return this;
        }
        public String getBase32StringSeed() {
            return this.base32StringSeed;
        }

    }

}
