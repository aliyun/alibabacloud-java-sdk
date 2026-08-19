// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUninstallApplicationsStatusResponseBody extends TeaModel {
    /**
     * <p>The list of uninstall applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<UpdateUninstallApplicationsStatusResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B769522-D50C-5978-8981-52BE800D6099</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUninstallApplicationsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUninstallApplicationsStatusResponseBody self = new UpdateUninstallApplicationsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUninstallApplicationsStatusResponseBody setApplications(java.util.List<UpdateUninstallApplicationsStatusResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<UpdateUninstallApplicationsStatusResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public UpdateUninstallApplicationsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateUninstallApplicationsStatusResponseBodyApplications extends TeaModel {
        /**
         * <p>The uninstall application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>uninstall-app-6646831ac314****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the uninstall application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-17 18:46:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The department to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Testing Department</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The ID of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The operating system type of the endpoint device. Valid values:</p>
         * <ul>
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>macOS</strong>: macOS.</li>
         * <li><strong>Linux</strong>: Linux.</li>
         * <li><strong>Android</strong>: Android.</li>
         * <li><strong>iOS</strong>: iOS.</li>
         * <li><strong>Windows_Wuying</strong>: WUYING Workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DevType")
        public String devType;

        /**
         * <p>The name of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The name of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Identity Provider</p>
         */
        @NameInMap("IdpName")
        public String idpName;

        /**
         * <p>Indicates whether the uninstallation has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsUninstall")
        public Boolean isUninstall;

        /**
         * <p>The MAC address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The reason for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The status of the uninstall application. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Pending.</li>
         * <li><strong>Approved</strong>: Approved.</li>
         * <li><strong>Rejected</strong>: Rejected.</li>
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
         * <p>Mr. Wang</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateUninstallApplicationsStatusResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            UpdateUninstallApplicationsStatusResponseBodyApplications self = new UpdateUninstallApplicationsStatusResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setIdpName(String idpName) {
            this.idpName = idpName;
            return this;
        }
        public String getIdpName() {
            return this.idpName;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setIsUninstall(Boolean isUninstall) {
            this.isUninstall = isUninstall;
            return this;
        }
        public Boolean getIsUninstall() {
            return this.isUninstall;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateUninstallApplicationsStatusResponseBodyApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
