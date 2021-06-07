// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeMfaDevicesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextToken")
    public String nextToken;

    // mfa device list
    @NameInMap("MfaDevices")
    public java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> mfaDevices;

    public static DescribeMfaDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMfaDevicesResponseBody self = new DescribeMfaDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMfaDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMfaDevicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMfaDevicesResponseBody setMfaDevices(java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> mfaDevices) {
        this.mfaDevices = mfaDevices;
        return this;
    }
    public java.util.List<DescribeMfaDevicesResponseBodyMfaDevices> getMfaDevices() {
        return this.mfaDevices;
    }

    public static class DescribeMfaDevicesResponseBodyMfaDevices extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("DeviceType")
        public String deviceType;

        public static DescribeMfaDevicesResponseBodyMfaDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeMfaDevicesResponseBodyMfaDevices self = new DescribeMfaDevicesResponseBodyMfaDevices();
            return TeaModel.build(map, self);
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeMfaDevicesResponseBodyMfaDevices setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
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

        public DescribeMfaDevicesResponseBodyMfaDevices setConsecutiveFails(Integer consecutiveFails) {
            this.consecutiveFails = consecutiveFails;
            return this;
        }
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
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

        public DescribeMfaDevicesResponseBodyMfaDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

    }

}
