// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the MFA device.</p>
     */
    @NameInMap("VirtualMFADevice")
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice;

    public static CreateVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponseBody self = new CreateVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualMFADeviceResponseBody setVirtualMFADevice(CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
        return this;
    }
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice getVirtualMFADevice() {
        return this.virtualMFADevice;
    }

    public static class CreateVirtualMFADeviceResponseBodyVirtualMFADevice extends TeaModel {
        /**
         * <p>The key of the MFA device.</p>
         */
        @NameInMap("Base32StringSeed")
        public String base32StringSeed;

        /**
         * <p>The Base64-encoded QR code of the key.</p>
         */
        @NameInMap("QRCodePNG")
        public String QRCodePNG;

        /**
         * <p>The serial number of the MFA device.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static CreateVirtualMFADeviceResponseBodyVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualMFADeviceResponseBodyVirtualMFADevice self = new CreateVirtualMFADeviceResponseBodyVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setBase32StringSeed(String base32StringSeed) {
            this.base32StringSeed = base32StringSeed;
            return this;
        }
        public String getBase32StringSeed() {
            return this.base32StringSeed;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setQRCodePNG(String QRCodePNG) {
            this.QRCodePNG = QRCodePNG;
            return this;
        }
        public String getQRCodePNG() {
            return this.QRCodePNG;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
