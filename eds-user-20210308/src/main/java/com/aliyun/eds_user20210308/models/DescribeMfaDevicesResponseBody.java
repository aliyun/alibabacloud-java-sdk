// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesResponseBody extends TeaModel {
    /**
     * <p>The information about the virtual MFA devices.</p>
     */
    @NameInMap("MfaDevices")
    public java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> mfaDevices;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6na6YlN9asMM31MsMcdQNpp</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33DBB8EC-6E68-4726-91C4-E09C59D9A7D8</p>
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
         * <p>The number of consecutive failures to bind the virtual MFA device, or the number of authentication failures based on the virtual MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        /**
         * <p>The type of the virtual MFA device. The value can only be TOTP_VIRTUAL. This value indicates that the virtual MFA device follows the Time-based One-time Password (TOTP) algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>TOTP_VIRTUAL</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username of the convenience user that uses the virtual MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the virtual MFA device was enabled. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-22T06:20:49Z</p>
         */
        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        /**
         * <p>The time when the locked virtual MFA device was automatically unlocked. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-23T06:20:49Z</p>
         */
        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The serial number of the virtual MFA device. The serial number is unique for each device.</p>
         * 
         * <strong>example:</strong>
         * <p>dc856334-446b-4035-bfbc-18af261e****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The status of the virtual MFA device.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>LOCKED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>UNBOUND</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NORMAL</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
