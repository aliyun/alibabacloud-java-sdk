// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    /**
     * <p>The devices that are returned.</p>
     */
    @NameInMap("Devices")
    public java.util.List<DescribeDevicesResponseBodyDevices> devices;

    /**
     * <p>The ID that is returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setDevices(java.util.List<DescribeDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDevicesResponseBodyDevicesEndUserList extends TeaModel {
        /**
         * <p>The address of the AD workspace.</p>
         */
        @NameInMap("AdDomain")
        public String adDomain;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The type of the account.</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static DescribeDevicesResponseBodyDevicesEndUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevicesEndUserList self = new DescribeDevicesResponseBodyDevicesEndUserList();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevicesEndUserList setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public DescribeDevicesResponseBodyDevicesEndUserList setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDevicesResponseBodyDevicesEndUserList setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDevicesResponseBodyDevicesEndUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class DescribeDevicesResponseBodyDevices extends TeaModel {
        /**
         * <p>The ID of the device.</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The users that are bound.</p>
         */
        @NameInMap("EndUserList")
        public java.util.List<DescribeDevicesResponseBodyDevicesEndUserList> endUserList;

        public static DescribeDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevices self = new DescribeDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDevicesResponseBodyDevices setEndUserList(java.util.List<DescribeDevicesResponseBodyDevicesEndUserList> endUserList) {
            this.endUserList = endUserList;
            return this;
        }
        public java.util.List<DescribeDevicesResponseBodyDevicesEndUserList> getEndUserList() {
            return this.endUserList;
        }

    }

}
