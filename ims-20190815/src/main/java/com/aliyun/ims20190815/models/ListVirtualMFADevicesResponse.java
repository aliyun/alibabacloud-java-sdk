// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("VirtualMFADevices")
    @Validation(required = true)
    public ListVirtualMFADevicesResponseVirtualMFADevices virtualMFADevices;

    public static ListVirtualMFADevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponse self = new ListVirtualMFADevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualMFADevicesResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListVirtualMFADevicesResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListVirtualMFADevicesResponse setVirtualMFADevices(ListVirtualMFADevicesResponseVirtualMFADevices virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public ListVirtualMFADevicesResponseVirtualMFADevices getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser extends TeaModel {
        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        public static ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser self = new ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("ActivateDate")
        @Validation(required = true)
        public String activateDate;

        @NameInMap("User")
        @Validation(required = true)
        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser user;

        public static ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice self = new ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice setUser(ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser user) {
            this.user = user;
            return this;
        }
        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser getUser() {
            return this.user;
        }

    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevices extends TeaModel {
        @NameInMap("VirtualMFADevice")
        @Validation(required = true)
        public java.util.List<ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice> virtualMFADevice;

        public static ListVirtualMFADevicesResponseVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevices self = new ListVirtualMFADevicesResponseVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseVirtualMFADevices setVirtualMFADevice(java.util.List<ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice> virtualMFADevice) {
            this.virtualMFADevice = virtualMFADevice;
            return this;
        }
        public java.util.List<ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

    }

}
