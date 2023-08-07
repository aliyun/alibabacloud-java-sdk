// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesResponseBody extends TeaModel {
    /**
     * <p>Details about the virtual MFA devices.</p>
     */
    @NameInMap("MfaDevices")
    public java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> mfaDevices;

    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMfaDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesResponseBody self = new DescribeMfaDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMfaDevicesResponseBody setMfaDevices(java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> mfaDevices) {
        this.mfaDevices = mfaDevices;
        return this;
    }
    public java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> getMfaDevices() {
        return this.mfaDevices;
    }

    public DescribeMfaDevicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMfaDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMfaDevicesResponseBodyMfaDevices extends TeaModel {
        /**
         * <p>The number of consecutive failures to bind the virtual MFA device, or the number of MFA failures based on the virtual MFA device.</p>
         */
        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        /**
         * <p>The types of the virtual MFA device. Set the value to TOTP_VIRTUAL, which indicates that the virtual MFA devices follow the Time-based One-time Password (TOTP) algorithm.</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username of the convenience user that uses the virtual MFA device.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the virtual MFA device was enabled. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        /**
         * <p>The time when a locked virtual MFA device is automatically unlocked. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The status of the virtual MFA device. Valid values:</p>
         * <br>
         * <p>*   UNBOUND</p>
         * <p>*   NORMAL</p>
         * <p>*   LOCKED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMfaDevicesResponseBodyMfaDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeMfaDevicesResponseBodyMfaDevices self = new DescribeMfaDevicesResponseBodyMfaDevices();
            return TeaModel.build(map, self);
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setConsecutiveFails(Integer consecutiveFails) {
            this.consecutiveFails = consecutiveFails;
            return this;
        }
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setGmtEnabled(String gmtEnabled) {
            this.gmtEnabled = gmtEnabled;
            return this;
        }
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setGmtUnlock(String gmtUnlock) {
            this.gmtUnlock = gmtUnlock;
            return this;
        }
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
