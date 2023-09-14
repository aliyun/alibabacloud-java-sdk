// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListExcessiveDeviceRegistrationApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListExcessiveDeviceRegistrationApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExcessiveDeviceRegistrationApplicationsResponseBody self = new ListExcessiveDeviceRegistrationApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExcessiveDeviceRegistrationApplicationsResponseBody setApplications(java.util.List<ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListExcessiveDeviceRegistrationApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExcessiveDeviceRegistrationApplicationsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications extends TeaModel {
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

        public static ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications self = new ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setIsUsed(Boolean isUsed) {
            this.isUsed = isUsed;
            return this;
        }
        public Boolean getIsUsed() {
            return this.isUsed;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
