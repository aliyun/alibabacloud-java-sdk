// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessResponseBody extends TeaModel {
    /**
     * <p>The approval process.</p>
     */
    @NameInMap("Process")
    public CreateApprovalProcessResponseBodyProcess process;

    /**
     * <p>The ID of the request.</p>
     * 
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
        /**
         * <p>The list of terminal uninstallation policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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
        /**
         * <p>The list of device registration policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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
        /**
         * <p>The list of file outbound transfer policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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
        /**
         * <p>The list of domain name blacklist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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
        /**
         * <p>The list of domain name whitelist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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

    public static class CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies self = new CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies extends TeaModel {
        /**
         * <p>The list of peripheral control policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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

    public static class CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies self = new CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcessProcessNodes extends TeaModel {
        /**
         * <p>The approver ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The username of the approver.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
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
        /**
         * <p>The list of software blocking policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
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

    public static class CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies self = new CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class CreateApprovalProcessResponseBodyProcess extends TeaModel {
        /**
         * <p>The list of policies associated with terminal uninstallation.</p>
         */
        @NameInMap("AppUninstallPolicies")
        public CreateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies;

        /**
         * <p>The time when the approval process was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-25 10:44:09</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个审批流程</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of policies associated with device registration.</p>
         */
        @NameInMap("DeviceRegistrationPolicies")
        public CreateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies;

        /**
         * <p>The list of policies associated with file outbound transfer.</p>
         */
        @NameInMap("DlpSendPolicies")
        public CreateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies;

        /**
         * <p>The list of policies associated with the domain name blacklist.</p>
         */
        @NameInMap("DomainBlacklistPolicies")
        public CreateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies;

        /**
         * <p>The list of policies associated with the domain name whitelist.</p>
         */
        @NameInMap("DomainWhitelistPolicies")
        public CreateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies;

        @NameInMap("EndpointHardeningPolicies")
        public CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies;

        /**
         * <p>The list of policies associated with peripheral control.</p>
         */
        @NameInMap("PeripheralBlockPolicies")
        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies;

        @NameInMap("PrivateAccessBlockPolicies")
        public CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies;

        /**
         * <p>The ID of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-dc61e92ba5c5****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The list of approval nodes.</p>
         */
        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<CreateApprovalProcessResponseBodyProcessProcessNodes>> processNodes;

        /**
         * <p>The list of policies associated with software blocking.</p>
         */
        @NameInMap("SoftwareBlockPolicies")
        public CreateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies;

        @NameInMap("SoftwareHardeningPolicies")
        public CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies;

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

        public CreateApprovalProcessResponseBodyProcess setEndpointHardeningPolicies(CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies) {
            this.endpointHardeningPolicies = endpointHardeningPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessEndpointHardeningPolicies getEndpointHardeningPolicies() {
            return this.endpointHardeningPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setPeripheralBlockPolicies(CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies) {
            this.peripheralBlockPolicies = peripheralBlockPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessPeripheralBlockPolicies getPeripheralBlockPolicies() {
            return this.peripheralBlockPolicies;
        }

        public CreateApprovalProcessResponseBodyProcess setPrivateAccessBlockPolicies(CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies) {
            this.privateAccessBlockPolicies = privateAccessBlockPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies getPrivateAccessBlockPolicies() {
            return this.privateAccessBlockPolicies;
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

        public CreateApprovalProcessResponseBodyProcess setSoftwareHardeningPolicies(CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies) {
            this.softwareHardeningPolicies = softwareHardeningPolicies;
            return this;
        }
        public CreateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies getSoftwareHardeningPolicies() {
            return this.softwareHardeningPolicies;
        }

    }

}
