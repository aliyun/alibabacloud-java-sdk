// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody extends TeaModel {
    /**
     * <p>List of device registration applications that exceed your quota.</p>
     */
    @NameInMap("Applications")
    public java.util.List<UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications> applications;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody self = new UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody setApplications(java.util.List<UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications extends TeaModel {
        /**
         * <p>ID of the device registration application.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-application-0f4a127b7e78****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>Time when the device registration application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-17 18:46:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Department to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>This field indicates the reason for the excessive device registration request.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条超额注册申请</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ID of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>Operating system of the endpoint device. Valid values:</p>
         * <ul>
         * <li><p><strong>Windows</strong>: Windows operating system.</p>
         * </li>
         * <li><p><strong>macOS</strong>: macOS operating system.</p>
         * </li>
         * <li><p><strong>Linux</strong>: Linux operating system.</p>
         * </li>
         * <li><p><strong>Android</strong>: Android operating system.</p>
         * </li>
         * <li><p><strong>iOS</strong>: iOS operating system.</p>
         * </li>
         * <li><p><strong>Windows_Wuying</strong>: Alibaba Cloud Cloud Desktop operating system.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>Name of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Indicates whether the device registration application has been used. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Used.</p>
         * </li>
         * <li><p><strong>false</strong>: Not used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsUsed")
        public Boolean isUsed;

        /**
         * <p>MAC address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Status of the device registration application. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: Pending review.</p>
         * </li>
         * <li><p><strong>Approved</strong>: Approved.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: Rejected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications self = new UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setIsUsed(Boolean isUsed) {
            this.isUsed = isUsed;
            return this;
        }
        public Boolean getIsUsed() {
            return this.isUsed;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
