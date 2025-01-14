// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MatchSchemas")
    public CreateApprovalProcessRequestMatchSchemas matchSchemas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_process</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
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
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("AppUninstallSchemaId")
        public String appUninstallSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DeviceRegistrationSchemaId")
        public String deviceRegistrationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DlpSendSchemaId")
        public String dlpSendSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainBlacklistSchemaId")
        public String domainBlacklistSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainWhitelistSchemaId")
        public String domainWhitelistSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("PeripheralBlockSchemaId")
        public String peripheralBlockSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SoftwareBlockSchemaId")
        public String softwareBlockSchemaId;

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

        public CreateApprovalProcessRequestMatchSchemas setPeripheralBlockSchemaId(String peripheralBlockSchemaId) {
            this.peripheralBlockSchemaId = peripheralBlockSchemaId;
            return this;
        }
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        public CreateApprovalProcessRequestMatchSchemas setSoftwareBlockSchemaId(String softwareBlockSchemaId) {
            this.softwareBlockSchemaId = softwareBlockSchemaId;
            return this;
        }
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

    }

}
