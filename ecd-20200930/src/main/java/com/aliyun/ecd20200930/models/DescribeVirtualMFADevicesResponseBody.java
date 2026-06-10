// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesResponseBody extends TeaModel {
    /**
     * <p>The token to retrieve the next page of results. If this parameter is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL23as</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FB550AAB-FB36-4A91-93F6-F4374AF65403</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of virtual MFA devices.</p>
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

    public static class DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayNameNew")
        public String displayNameNew;

        @NameInMap("EndUser")
        public String endUser;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser self = new DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser setDisplayNameNew(String displayNameNew) {
            this.displayNameNew = displayNameNew;
            return this;
        }
        public String getDisplayNameNew() {
            return this.displayNameNew;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser setEndUser(String endUser) {
            this.endUser = endUser;
            return this;
        }
        public String getEndUser() {
            return this.endUser;
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class DescribeVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        @NameInMap("AdUser")
        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser adUser;

        /**
         * <p>The number of consecutive failed attempts to bind or authenticate the virtual MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConsecutiveFails")
        public Integer consecutiveFails;

        /**
         * <blockquote>
         * <p>This parameter is in private preview.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The AD username of the bound user.</p>
         * 
         * <strong>example:</strong>
         * <p>usertest</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the virtual MFA device was enabled. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC, as specified by the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T14:52:28Z</p>
         */
        @NameInMap("GmtEnabled")
        public String gmtEnabled;

        /**
         * <p>The time when the locked virtual MFA device is automatically unlocked. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC, as specified by the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-21T15:21:28Z</p>
         */
        @NameInMap("GmtUnlock")
        public String gmtUnlock;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-269345****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The serial number of the virtual MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>a25f297f-f2e1-4a44-bbf1-5f48a6e5****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The status of the virtual MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualMFADevicesResponseBodyVirtualMFADevices self = new DescribeVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevices setAdUser(DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser adUser) {
            this.adUser = adUser;
            return this;
        }
        public DescribeVirtualMFADevicesResponseBodyVirtualMFADevicesAdUser getAdUser() {
            return this.adUser;
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
