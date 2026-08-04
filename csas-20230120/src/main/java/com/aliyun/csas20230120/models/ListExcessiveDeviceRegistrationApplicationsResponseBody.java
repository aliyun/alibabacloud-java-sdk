// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListExcessiveDeviceRegistrationApplicationsResponseBody extends TeaModel {
    /**
     * <p>A list of excessive device registration applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of excessive device registration applications.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-application-0f4a127b7e78****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The creation time of the excessive device registration application.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-17 18:46:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user\&quot;s department.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The reason for the excessive device registration application.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条超额注册申请</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>The operating system of the device. Valid values:</p>
         * <ul>
         * <li><p><strong>Windows</strong>: The Windows operating system.</p>
         * </li>
         * <li><p><strong>macOS</strong>: The macOS operating system.</p>
         * </li>
         * <li><p><strong>Linux</strong>: The Linux operating system.</p>
         * </li>
         * <li><p><strong>Android</strong>: The Android operating system.</p>
         * </li>
         * <li><p><strong>iOS</strong>: The iOS operating system.</p>
         * </li>
         * <li><p><strong>Windows_Wuying</strong>: Wuying Workspace.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>A list of full department paths.</p>
         */
        @NameInMap("FullDepartment")
        public java.util.List<String> fullDepartment;

        /**
         * <p>The hostname of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Specifies whether the excessive device registration application has been used. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The application has been used.</p>
         * </li>
         * <li><p><strong>false</strong>: The application has not been used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsUsed")
        public Boolean isUsed;

        /**
         * <p>The MAC address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The status of the excessive device registration application. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong></p>
         * </li>
         * <li><p><strong>Approved</strong></p>
         * </li>
         * <li><p><strong>Rejected</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
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

        public ListExcessiveDeviceRegistrationApplicationsResponseBodyApplications setFullDepartment(java.util.List<String> fullDepartment) {
            this.fullDepartment = fullDepartment;
            return this;
        }
        public java.util.List<String> getFullDepartment() {
            return this.fullDepartment;
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
