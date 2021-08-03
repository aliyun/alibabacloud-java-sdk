// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("status")
        public String status;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        public static DescribeVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualMFADevicesResponseBodyVirtualMFADevices self = new DescribeVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setGmtUnlock(String gmtUnlock) {
            this.gmtUnlock = gmtUnlock;
            return this;
        }
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setConsecutiveFails(Integer consecutiveFails) {
            this.consecutiveFails = consecutiveFails;
            return this;
        }
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setGmtEnabled(String gmtEnabled) {
            this.gmtEnabled = gmtEnabled;
            return this;
        }
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

    }

}
