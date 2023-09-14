// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBodyApplications> applications;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Department")
        public String department;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceTag")
        public String deviceTag;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("IsUsed")
        public Boolean isUsed;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Status")
        public String status;

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
