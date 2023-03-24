// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the MFA device.</p>
     */
    @NameInMap("VirtualMFADevices")
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices;

    public static ListVirtualMFADevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponseBody self = new ListVirtualMFADevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListVirtualMFADevicesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListVirtualMFADevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualMFADevicesResponseBody setVirtualMFADevices(ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser extends TeaModel {
        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice extends TeaModel {
        /**
         * <p>The time when the MFA device was activated.</p>
         */
        @NameInMap("ActivateDate")
        public String activateDate;

        /**
         * <p>The serial number of the MFA device.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The information of the RAM user that has an MFA device bound.</p>
         */
        @NameInMap("User")
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setUser(ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user) {
            this.user = user;
            return this;
        }
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser getUser() {
            return this.user;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        @NameInMap("VirtualMFADevice")
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevices self = new ListVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setVirtualMFADevice(java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice) {
            this.virtualMFADevice = virtualMFADevice;
            return this;
        }
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

    }

}
