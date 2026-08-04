// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessRequest extends TeaModel {
    /**
     * <p>The description of the approval process. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个审批流程</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The matched approval templates.</p>
     */
    @NameInMap("MatchSchemas")
    public CreateApprovalProcessRequestMatchSchemas matchSchemas;

    /**
     * <p>The process name. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_process</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The list of approval nodes. You can define up to 5 approval nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static CreateApprovalProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApprovalProcessRequest self = new CreateApprovalProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateApprovalProcessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApprovalProcessRequest setMatchSchemas(CreateApprovalProcessRequestMatchSchemas matchSchemas) {
        this.matchSchemas = matchSchemas;
        return this;
    }
    public CreateApprovalProcessRequestMatchSchemas getMatchSchemas() {
        return this.matchSchemas;
    }

    public CreateApprovalProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateApprovalProcessRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

    public static class CreateApprovalProcessRequestMatchSchemas extends TeaModel {
        /**
         * <p>The ID of the device uninstall approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("AppUninstallSchemaId")
        public String appUninstallSchemaId;

        /**
         * <p>The ID of the device registration approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DeviceRegistrationSchemaId")
        public String deviceRegistrationSchemaId;

        /**
         * <p>The ID of the file outbound transfer approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DlpSendSchemaId")
        public String dlpSendSchemaId;

        /**
         * <p>The ID of the domain name blacklist approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainBlacklistSchemaId")
        public String domainBlacklistSchemaId;

        /**
         * <p>The ID of the domain name whitelist approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainWhitelistSchemaId")
        public String domainWhitelistSchemaId;

        @NameInMap("EndpointHardeningSchemaId")
        public String endpointHardeningSchemaId;

        /**
         * <p>The ID of the peripheral control approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("PeripheralBlockSchemaId")
        public String peripheralBlockSchemaId;

        @NameInMap("PrivateAccessBlockSchemaId")
        public String privateAccessBlockSchemaId;

        /**
         * <p>The ID of the software blocking approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SoftwareBlockSchemaId")
        public String softwareBlockSchemaId;

        @NameInMap("SoftwareHardeningSchemaId")
        public String softwareHardeningSchemaId;

        public static CreateApprovalProcessRequestMatchSchemas build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessRequestMatchSchemas self = new CreateApprovalProcessRequestMatchSchemas();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessRequestMatchSchemas setAppUninstallSchemaId(String appUninstallSchemaId) {
            this.appUninstallSchemaId = appUninstallSchemaId;
            return this;
        }
        public String getAppUninstallSchemaId() {
            return this.appUninstallSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setDeviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
            this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
            return this;
        }
        public String getDeviceRegistrationSchemaId() {
            return this.deviceRegistrationSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setDlpSendSchemaId(String dlpSendSchemaId) {
            this.dlpSendSchemaId = dlpSendSchemaId;
            return this;
        }
        public String getDlpSendSchemaId() {
            return this.dlpSendSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setDomainBlacklistSchemaId(String domainBlacklistSchemaId) {
            this.domainBlacklistSchemaId = domainBlacklistSchemaId;
            return this;
        }
        public String getDomainBlacklistSchemaId() {
            return this.domainBlacklistSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setDomainWhitelistSchemaId(String domainWhitelistSchemaId) {
            this.domainWhitelistSchemaId = domainWhitelistSchemaId;
            return this;
        }
        public String getDomainWhitelistSchemaId() {
            return this.domainWhitelistSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setEndpointHardeningSchemaId(String endpointHardeningSchemaId) {
            this.endpointHardeningSchemaId = endpointHardeningSchemaId;
            return this;
        }
        public String getEndpointHardeningSchemaId() {
            return this.endpointHardeningSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setPeripheralBlockSchemaId(String peripheralBlockSchemaId) {
            this.peripheralBlockSchemaId = peripheralBlockSchemaId;
            return this;
        }
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setPrivateAccessBlockSchemaId(String privateAccessBlockSchemaId) {
            this.privateAccessBlockSchemaId = privateAccessBlockSchemaId;
            return this;
        }
        public String getPrivateAccessBlockSchemaId() {
            return this.privateAccessBlockSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setSoftwareBlockSchemaId(String softwareBlockSchemaId) {
            this.softwareBlockSchemaId = softwareBlockSchemaId;
            return this;
        }
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setSoftwareHardeningSchemaId(String softwareHardeningSchemaId) {
            this.softwareHardeningSchemaId = softwareHardeningSchemaId;
            return this;
        }
        public String getSoftwareHardeningSchemaId() {
            return this.softwareHardeningSchemaId;
        }

    }

}
