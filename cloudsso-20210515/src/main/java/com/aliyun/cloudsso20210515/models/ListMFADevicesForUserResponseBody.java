// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListMFADevicesForUserResponseBody extends TeaModel {
    /**
     * <p>The MFA devices.</p>
     */
    @NameInMap("MFADevices")
    public java.util.List<ListMFADevicesForUserResponseBodyMFADevices> MFADevices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B9982ED-FD0D-5622-8EA0-7B768685DCE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of MFA devices.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListMFADevicesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMFADevicesForUserResponseBody self = new ListMFADevicesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMFADevicesForUserResponseBody setMFADevices(java.util.List<ListMFADevicesForUserResponseBodyMFADevices> MFADevices) {
        this.MFADevices = MFADevices;
        return this;
    }
    public java.util.List<ListMFADevicesForUserResponseBodyMFADevices> getMFADevices() {
        return this.MFADevices;
    }

    public ListMFADevicesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMFADevicesForUserResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListMFADevicesForUserResponseBodyMFADevices extends TeaModel {
        /**
         * <p>The ID of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>mfa-00ujhet8pycljj7j****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The name of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice-MFA1</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The type of the MFA device. The value is fixed as TOTP, which indicates a virtual MFA device. Virtual MFA devices are based on the Time-based One-time Password (TOTP) algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>TOTP</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the MFA device was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-29T09:14:06Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListMFADevicesForUserResponseBodyMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListMFADevicesForUserResponseBodyMFADevices self = new ListMFADevicesForUserResponseBodyMFADevices();
            return TeaModel.build(map, self);
        }

        public ListMFADevicesForUserResponseBodyMFADevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListMFADevicesForUserResponseBodyMFADevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListMFADevicesForUserResponseBodyMFADevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListMFADevicesForUserResponseBodyMFADevices setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListMFADevicesForUserResponseBodyMFADevices setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
