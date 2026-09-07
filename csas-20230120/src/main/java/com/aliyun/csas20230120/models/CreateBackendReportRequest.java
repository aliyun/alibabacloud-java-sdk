// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateBackendReportRequest extends TeaModel {
    /**
     * <p>The filing expiration time as a UNIX timestamp in seconds. This parameter is required when ValidityType is set to FixedTime or ValidityType is not specified, and the value must be later than the current time. When ValidityType is set to Permanent, do not specify this parameter or set it to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1788192000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The filing policy type. Valid values:</p>
     * <ul>
     * <li>PrivateAccessBlock: private access.</li>
     * <li>DomainWhitelist: domain name whitelist.</li>
     * <li>DomainBlacklist: domain name blacklist.</li>
     * <li>SoftwareBlock: software blocking.</li>
     * <li>DlpSend: file outbound transfer.</li>
     * <li>PeripheralBlock: peripheral control.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateAccessBlock</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The filing reason. The value must be 1 to 1024 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Temporary project access</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The list of filing objects, serialized in Flat format. You can specify 1 to 100 filing objects of the same policy type. The object fields must match the PolicyType value.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportObjects")
    public java.util.List<CreateBackendReportRequestReportObjects> reportObjects;

    /**
     * <p>The list of filing users, serialized in Flat format. You can specify 1 to 100 users. Only specific SASE users under the current Alibaba Cloud account are supported. The product of the number of deduplicated users and the number of filing objects cannot exceed 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateBackendReportRequestTargets> targets;

    /**
     * <p>The validity duration type. Default value: FixedTime. Valid values:</p>
     * <ul>
     * <li>FixedTime: Expires at the specified time.</li>
     * <li>Permanent: Permanently valid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FixedTime</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static CreateBackendReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendReportRequest self = new CreateBackendReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackendReportRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public CreateBackendReportRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateBackendReportRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateBackendReportRequest setReportObjects(java.util.List<CreateBackendReportRequestReportObjects> reportObjects) {
        this.reportObjects = reportObjects;
        return this;
    }
    public java.util.List<CreateBackendReportRequestReportObjects> getReportObjects() {
        return this.reportObjects;
    }

    public CreateBackendReportRequest setTargets(java.util.List<CreateBackendReportRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<CreateBackendReportRequestTargets> getTargets() {
        return this.targets;
    }

    public CreateBackendReportRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class CreateBackendReportRequestReportObjects extends TeaModel {
        /**
         * <p>The private access application ID. This parameter is required when PolicyType is set to PrivateAccessBlock. You can call ListPrivateAccessApplications to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-app-****************1234</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The endpoint operating system. This parameter is required when PolicyType is set to PeripheralBlock. Valid values:</p>
         * <ul>
         * <li>windows: Windows.</li>
         * <li>macOS: macOS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("DevType")
        public String devType;

        /**
         * <p>The peripheral channel. This parameter is required when PolicyType is set to PeripheralBlock. Windows supports usbStorage, printer, mobile, cardReader, cdrom, and bluetooth. macOS supports usbStorage, airDrop, mobile, and bluetooth.</p>
         * 
         * <strong>example:</strong>
         * <p>usbStorage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The file MD5 hash. This parameter is required when PolicyType is set to DlpSend. The value must be a 32-character hexadecimal string and is case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>c936226c4745125b5786527d205a****</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The filing domain name. This parameter is required when PolicyType is set to DomainWhitelist or DomainBlacklist. Regular domain names and wildcard domain names that start with *. are supported. Protocols, ports, and paths are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("ReportDomain")
        public String reportDomain;

        /**
         * <p>The peripheral filing granularity. This parameter is required when PolicyType is set to PeripheralBlock. Currently, only Channel is supported, which indicates filing by peripheral channel.</p>
         * 
         * <strong>example:</strong>
         * <p>Channel</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The blocked software ID. This parameter is required when PolicyType is set to SoftwareBlock.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-c717ee516145****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static CreateBackendReportRequestReportObjects build(java.util.Map<String, ?> map) throws Exception {
            CreateBackendReportRequestReportObjects self = new CreateBackendReportRequestReportObjects();
            return TeaModel.build(map, self);
        }

        public CreateBackendReportRequestReportObjects setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public CreateBackendReportRequestReportObjects setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public CreateBackendReportRequestReportObjects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public CreateBackendReportRequestReportObjects setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public CreateBackendReportRequestReportObjects setReportDomain(String reportDomain) {
            this.reportDomain = reportDomain;
            return this;
        }
        public String getReportDomain() {
            return this.reportDomain;
        }

        public CreateBackendReportRequestReportObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateBackendReportRequestReportObjects setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class CreateBackendReportRequestTargets extends TeaModel {
        /**
         * <p>The SASE user ID. You can call ListUsers to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>su_8548af20c3b30e931e75cd847a4c****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateBackendReportRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateBackendReportRequestTargets self = new CreateBackendReportRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateBackendReportRequestTargets setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
