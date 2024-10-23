// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the MFA device is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMFAEnable")
    public Boolean isMFAEnable;

    /**
     * <p>The information about the MFA device.</p>
     */
    @NameInMap("MFADevice")
    public GetUserMFAInfoResponseBodyMFADevice MFADevice;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FCF7322A-20A9-4F68-8B7F-F86958839BC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserMFAInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponseBody self = new GetUserMFAInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponseBody setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
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

    public static class GetUserMFAInfoResponseBodyMFADevice extends TeaModel {
        /**
         * <p>The serial number of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:mfa/device001</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The type of the MFA device. Valid values:</p>
         * <ul>
         * <li>VMFA: virtual MFA device</li>
         * <li>U2F: Universal 2nd Factor (U2F) security key</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VMFA</p>
         */
        @NameInMap("Type")
        public String type;

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

        public GetUserMFAInfoResponseBodyMFADevice setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
