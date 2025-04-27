// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("MatchSchemas")
    public UpdateApprovalProcessRequestMatchSchemas matchSchemas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static UpdateApprovalProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessRequest self = new UpdateApprovalProcessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApprovalProcessRequest setMatchSchemas(UpdateApprovalProcessRequestMatchSchemas matchSchemas) {
        this.matchSchemas = matchSchemas;
        return this;
    }
    public UpdateApprovalProcessRequestMatchSchemas getMatchSchemas() {
        return this.matchSchemas;
    }

    public UpdateApprovalProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateApprovalProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public UpdateApprovalProcessRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

    public static class UpdateApprovalProcessRequestMatchSchemas extends TeaModel {
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

        @NameInMap("EndpointHardeningSchemaId")
        public String endpointHardeningSchemaId;

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

        @NameInMap("SoftwareHardeningSchemaId")
        public String softwareHardeningSchemaId;

        public static UpdateApprovalProcessRequestMatchSchemas build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemas self = new UpdateApprovalProcessRequestMatchSchemas();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemas setAppUninstallSchemaId(String appUninstallSchemaId) {
            this.appUninstallSchemaId = appUninstallSchemaId;
            return this;
        }
        public String getAppUninstallSchemaId() {
            return this.appUninstallSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDeviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
            this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
            return this;
        }
        public String getDeviceRegistrationSchemaId() {
            return this.deviceRegistrationSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDlpSendSchemaId(String dlpSendSchemaId) {
            this.dlpSendSchemaId = dlpSendSchemaId;
            return this;
        }
        public String getDlpSendSchemaId() {
            return this.dlpSendSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDomainBlacklistSchemaId(String domainBlacklistSchemaId) {
            this.domainBlacklistSchemaId = domainBlacklistSchemaId;
            return this;
        }
        public String getDomainBlacklistSchemaId() {
            return this.domainBlacklistSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDomainWhitelistSchemaId(String domainWhitelistSchemaId) {
            this.domainWhitelistSchemaId = domainWhitelistSchemaId;
            return this;
        }
        public String getDomainWhitelistSchemaId() {
            return this.domainWhitelistSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setEndpointHardeningSchemaId(String endpointHardeningSchemaId) {
            this.endpointHardeningSchemaId = endpointHardeningSchemaId;
            return this;
        }
        public String getEndpointHardeningSchemaId() {
            return this.endpointHardeningSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setPeripheralBlockSchemaId(String peripheralBlockSchemaId) {
            this.peripheralBlockSchemaId = peripheralBlockSchemaId;
            return this;
        }
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setSoftwareBlockSchemaId(String softwareBlockSchemaId) {
            this.softwareBlockSchemaId = softwareBlockSchemaId;
            return this;
        }
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setSoftwareHardeningSchemaId(String softwareHardeningSchemaId) {
            this.softwareHardeningSchemaId = softwareHardeningSchemaId;
            return this;
        }
        public String getSoftwareHardeningSchemaId() {
            return this.softwareHardeningSchemaId;
        }

    }

}
