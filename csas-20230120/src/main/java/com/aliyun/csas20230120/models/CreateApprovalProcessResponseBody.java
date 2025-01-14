// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessResponseBody extends TeaModel {
    @NameInMap("Process")
    public CreateApprovalProcessResponseBodyProcess process;

    /**
     * <strong>example:</strong>
     * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApprovalProcessResponseBody self = new CreateApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApprovalProcessResponseBody setProcess(CreateApprovalProcessResponseBodyProcess process) {
        this.process = process;
        return this;
    }
    public CreateApprovalProcessResponseBodyProcess getProcess() {
        return this.process;
    }

    public CreateApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApprovalProcessResponseBodyProcessAppUninstallPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessAppUninstallPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessAppUninstallPolicies self = new CreateApprovalProcessResponseBodyProcessAppUninstallPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessAppUninstallPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessAppUninstallPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies self = new CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessDlpSendPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessDlpSendPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessDlpSendPolicies self = new CreateApprovalProcessResponseBodyProcessDlpSendPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessDlpSendPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessDlpSendPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies self = new CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies self = new CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies self = new CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessProcessNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Username")
        public String username;

        public static CreateApprovalProcessResponseBodyProcessProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessProcessNodes self = new CreateApprovalProcessResponseBodyProcessProcessNodes();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessProcessNodes setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public CreateApprovalProcessResponseBodyProcessProcessNodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies self = new CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcess extends TeaModel {
        @NameInMap("AppUninstallPolicies")
        public CreateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies;

        /**
         * <strong>example:</strong>
         * <p>2022-10-25 10:44:09</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceRegistrationPolicies")
        public CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies;

        @NameInMap("DlpSendPolicies")
        public CreateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies;

        @NameInMap("DomainBlacklistPolicies")
        public CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies;

        @NameInMap("DomainWhitelistPolicies")
        public CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies;

        @NameInMap("PeripheralBlockPolicies")
        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies;

        /**
         * <strong>example:</strong>
         * <p>approval-process-dc61e92ba5c5****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<CreateApprovalProcessResponseBodyProcessProcessNodes>> processNodes;

        @NameInMap("SoftwareBlockPolicies")
        public CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies;

        public static CreateApprovalProcessResponseBodyProcess build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcess self = new CreateApprovalProcessResponseBodyProcess();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcess setAppUninstallPolicies(CreateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies) {
            this.appUninstallPolicies = appUninstallPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessAppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateApprovalProcessResponseBodyProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApprovalProcessResponseBodyProcess setDeviceRegistrationPolicies(CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies) {
            this.deviceRegistrationPolicies = deviceRegistrationPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setDlpSendPolicies(CreateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies) {
            this.dlpSendPolicies = dlpSendPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessDlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setDomainBlacklistPolicies(CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies) {
            this.domainBlacklistPolicies = domainBlacklistPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setDomainWhitelistPolicies(CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies) {
            this.domainWhitelistPolicies = domainWhitelistPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setPeripheralBlockPolicies(CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies) {
            this.peripheralBlockPolicies = peripheralBlockPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies getPeripheralBlockPolicies() {
            return this.peripheralBlockPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public CreateApprovalProcessResponseBodyProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public CreateApprovalProcessResponseBodyProcess setProcessNodes(java.util.List<java.util.List<CreateApprovalProcessResponseBodyProcessProcessNodes>> processNodes) {
            this.processNodes = processNodes;
            return this;
        }
        public java.util.List<java.util.List<CreateApprovalProcessResponseBodyProcessProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        public CreateApprovalProcessResponseBodyProcess setSoftwareBlockPolicies(CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies) {
            this.softwareBlockPolicies = softwareBlockPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

    }

}
