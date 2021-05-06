// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VirtualMFADevices")
    @Validation(required = true)
    public java.util.List<DescribeVirtualMFADevicesResponseVirtualMFADevices> virtualMFADevices;

    public static DescribeVirtualMFADevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualMFADevicesResponse self = new DescribeVirtualMFADevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualMFADevicesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVirtualMFADevicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualMFADevicesResponse setVirtualMFADevices(java.util.List<DescribeVirtualMFADevicesResponseVirtualMFADevices> virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public java.util.List<DescribeVirtualMFADevicesResponseVirtualMFADevices> getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static class DescribeVirtualMFADevicesResponseVirtualMFADevices extends TeaModel {
        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("EndUserId")
        @Validation(required = true)
        public String endUserId;

        @NameInMap("GmtEnabled")
        @Validation(required = true)
        public String gmtEnabled;

        @NameInMap("GmtUnlock")
        @Validation(required = true)
        public String gmtUnlock;

        @NameInMap("ConsecutiveFails")
        @Validation(required = true)
        public Integer consecutiveFails;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        public static DescribeVirtualMFADevicesResponseVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualMFADevicesResponseVirtualMFADevices self = new DescribeVirtualMFADevicesResponseVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setGmtEnabled(String gmtEnabled) {
            this.gmtEnabled = gmtEnabled;
            return this;
        }
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setGmtUnlock(String gmtUnlock) {
            this.gmtUnlock = gmtUnlock;
            return this;
        }
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setConsecutiveFails(Integer consecutiveFails) {
            this.consecutiveFails = consecutiveFails;
            return this;
        }
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeVirtualMFADevicesResponseVirtualMFADevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
