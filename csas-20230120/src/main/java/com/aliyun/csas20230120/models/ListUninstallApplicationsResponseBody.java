// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUninstallApplicationsResponseBody extends TeaModel {
    /**
     * <p>The list of uninstall applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListUninstallApplicationsResponseBodyApplications> applications;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of uninstall applications.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListUninstallApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallApplicationsResponseBody self = new ListUninstallApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUninstallApplicationsResponseBody setApplications(java.util.List<ListUninstallApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListUninstallApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListUninstallApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUninstallApplicationsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListUninstallApplicationsResponseBodyApplications extends TeaModel {
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
         * <p>The ID of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The operating system type of the terminal device. Valid values:</p>
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
         * <p>The list of full department paths.</p>
         */
        @NameInMap("FullDepartment")
        public java.util.List<String> fullDepartment;

        /**
         * <p>The name of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The name of the user identity source.</p>
         * 
         * <strong>example:</strong>
         * <p>Test identity source</p>
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
         * <p>The MAC address of the terminal device.</p>
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
         * <p>The uninstall application status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Pending processing.</li>
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

        public static ListUninstallApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListUninstallApplicationsResponseBodyApplications self = new ListUninstallApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListUninstallApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListUninstallApplicationsResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUninstallApplicationsResponseBodyApplications setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListUninstallApplicationsResponseBodyApplications setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListUninstallApplicationsResponseBodyApplications setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public ListUninstallApplicationsResponseBodyApplications setFullDepartment(java.util.List<String> fullDepartment) {
            this.fullDepartment = fullDepartment;
            return this;
        }
        public java.util.List<String> getFullDepartment() {
            return this.fullDepartment;
        }

        public ListUninstallApplicationsResponseBodyApplications setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListUninstallApplicationsResponseBodyApplications setIdpName(String idpName) {
            this.idpName = idpName;
            return this;
        }
        public String getIdpName() {
            return this.idpName;
        }

        public ListUninstallApplicationsResponseBodyApplications setIsUninstall(Boolean isUninstall) {
            this.isUninstall = isUninstall;
            return this;
        }
        public Boolean getIsUninstall() {
            return this.isUninstall;
        }

        public ListUninstallApplicationsResponseBodyApplications setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListUninstallApplicationsResponseBodyApplications setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListUninstallApplicationsResponseBodyApplications setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListUninstallApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUninstallApplicationsResponseBodyApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
