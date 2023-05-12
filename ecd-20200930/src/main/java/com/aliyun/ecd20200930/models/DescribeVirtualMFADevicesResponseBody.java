// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponseBody extends TeaModel {
    /**
     * <p>The name of the AD user who uses the virtual MFA device.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("VirtualMFADevices")
    public java.util.List<DescribeVirtualMFADevicesResponseBodyVirtualMFADevices> virtualMFADevices;

    public static DescribeVirtualMFADevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualMFADevicesResponseBody self = new DescribeVirtualMFADevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualMFADevicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVirtualMFADevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualMFADevicesResponseBody setVirtualMFADevices(java.util.List<DescribeVirtualMFADevicesResponseBodyVirtualMFADevices> virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public java.util.List<DescribeVirtualMFADevicesResponseBodyVirtualMFADevices> getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static class DescribeVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        /**
         * <p>The time when the virtual MFA device is automatically unlocked after being locked. The time follows the [ISO 8601 standard](~~25696~~) in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The status of the virtual MFA device. The valid values include:</p>
         * <br>
         * <p>*   UNBOUND: The virtual MFA device is not bound.</p>
         * <p>*   NORMAL: The virtual MFA device is normal.</p>
         * <p>*   LOCKED: The virtual MFA device is locked.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>DescribeVirtualMFADevices</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualMFADevicesResponseBodyVirtualMFADevices self = new DescribeVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setConsecutiveFails(Integer consecutiveFails) {
            this.consecutiveFails = consecutiveFails;
            return this;
        }
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setGmtEnabled(String gmtEnabled) {
            this.gmtEnabled = gmtEnabled;
            return this;
        }
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setGmtUnlock(String gmtUnlock) {
            this.gmtUnlock = gmtUnlock;
            return this;
        }
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
