// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesResponseBody extends TeaModel {
    /**
     * <p>The list of approval processes.</p>
     */
    @NameInMap("Processes")
    public java.util.List<ListApprovalProcessesResponseBodyProcesses> processes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E39C33B-F565-55C6-ACC2-953FCE7DA7D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of approval processes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public String totalNum;

    public static ListApprovalProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalProcessesResponseBody self = new ListApprovalProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalProcessesResponseBody setProcesses(java.util.List<ListApprovalProcessesResponseBodyProcesses> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<ListApprovalProcessesResponseBodyProcesses> getProcesses() {
        return this.processes;
    }

    public ListApprovalProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApprovalProcessesResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public static class ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies extends TeaModel {
        /**
         * <p>The list of agent uninstallation policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies self = new ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies extends TeaModel {
        /**
         * <p>The list of device registration policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies self = new ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesDlpSendPolicies extends TeaModel {
        /**
         * <p>The list of file outgoing policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesDlpSendPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesDlpSendPolicies self = new ListApprovalProcessesResponseBodyProcessesDlpSendPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesDlpSendPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesDlpSendPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies extends TeaModel {
        /**
         * <p>The list of domain name blacklist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies self = new ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies extends TeaModel {
        /**
         * <p>The list of domain name whitelist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies self = new ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies self = new ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies extends TeaModel {
        /**
         * <p>The list of peripheral control policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies self = new ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies self = new ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesProcessNodes extends TeaModel {
        /**
         * <p>审批人ID。</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>审批人用户名。</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListApprovalProcessesResponseBodyProcessesProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesProcessNodes self = new ListApprovalProcessesResponseBodyProcessesProcessNodes();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesProcessNodes setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListApprovalProcessesResponseBodyProcessesProcessNodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies extends TeaModel {
        /**
         * <p>The list of software blocking policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies self = new ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies self = new ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class ListApprovalProcessesResponseBodyProcesses extends TeaModel {
        /**
         * <p>The list of policies associated with agent uninstallation.</p>
         */
        @NameInMap("AppUninstallPolicies")
        public ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies appUninstallPolicies;

        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>The time when the approval process was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-27 14:04:27</p>
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
        public ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies deviceRegistrationPolicies;

        /**
         * <p>The list of policies associated with file outgoing.</p>
         */
        @NameInMap("DlpSendPolicies")
        public ListApprovalProcessesResponseBodyProcessesDlpSendPolicies dlpSendPolicies;

        /**
         * <p>The list of policies associated with the domain name blacklist.</p>
         */
        @NameInMap("DomainBlacklistPolicies")
        public ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies domainBlacklistPolicies;

        /**
         * <p>The list of policies associated with the domain name whitelist.</p>
         */
        @NameInMap("DomainWhitelistPolicies")
        public ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies domainWhitelistPolicies;

        @NameInMap("EndpointHardeningPolicies")
        public ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies endpointHardeningPolicies;

        /**
         * <p>The list of policies associated with peripheral control.</p>
         */
        @NameInMap("PeripheralBlockPolicies")
        public ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies peripheralBlockPolicies;

        @NameInMap("PrivateAccessBlockPolicies")
        public ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies privateAccessBlockPolicies;

        /**
         * <p>The approval process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-35ee09077ee9****</p>
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
        public java.util.List<java.util.List<ListApprovalProcessesResponseBodyProcessesProcessNodes>> processNodes;

        /**
         * <p>The list of policies associated with software blocking.</p>
         */
        @NameInMap("SoftwareBlockPolicies")
        public ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies softwareBlockPolicies;

        @NameInMap("SoftwareHardeningPolicies")
        public ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies softwareHardeningPolicies;

        public static ListApprovalProcessesResponseBodyProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesResponseBodyProcesses self = new ListApprovalProcessesResponseBodyProcesses();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesResponseBodyProcesses setAppUninstallPolicies(ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies appUninstallPolicies) {
            this.appUninstallPolicies = appUninstallPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public ListApprovalProcessesResponseBodyProcesses setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApprovalProcessesResponseBodyProcesses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApprovalProcessesResponseBodyProcesses setDeviceRegistrationPolicies(ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies deviceRegistrationPolicies) {
            this.deviceRegistrationPolicies = deviceRegistrationPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setDlpSendPolicies(ListApprovalProcessesResponseBodyProcessesDlpSendPolicies dlpSendPolicies) {
            this.dlpSendPolicies = dlpSendPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesDlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setDomainBlacklistPolicies(ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies domainBlacklistPolicies) {
            this.domainBlacklistPolicies = domainBlacklistPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setDomainWhitelistPolicies(ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies domainWhitelistPolicies) {
            this.domainWhitelistPolicies = domainWhitelistPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setEndpointHardeningPolicies(ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies endpointHardeningPolicies) {
            this.endpointHardeningPolicies = endpointHardeningPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies getEndpointHardeningPolicies() {
            return this.endpointHardeningPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setPeripheralBlockPolicies(ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies peripheralBlockPolicies) {
            this.peripheralBlockPolicies = peripheralBlockPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies getPeripheralBlockPolicies() {
            return this.peripheralBlockPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setPrivateAccessBlockPolicies(ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies privateAccessBlockPolicies) {
            this.privateAccessBlockPolicies = privateAccessBlockPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesPrivateAccessBlockPolicies getPrivateAccessBlockPolicies() {
            return this.privateAccessBlockPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListApprovalProcessesResponseBodyProcesses setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListApprovalProcessesResponseBodyProcesses setProcessNodes(java.util.List<java.util.List<ListApprovalProcessesResponseBodyProcessesProcessNodes>> processNodes) {
            this.processNodes = processNodes;
            return this;
        }
        public java.util.List<java.util.List<ListApprovalProcessesResponseBodyProcessesProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        public ListApprovalProcessesResponseBodyProcesses setSoftwareBlockPolicies(ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies softwareBlockPolicies) {
            this.softwareBlockPolicies = softwareBlockPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesSoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

        public ListApprovalProcessesResponseBodyProcesses setSoftwareHardeningPolicies(ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies softwareHardeningPolicies) {
            this.softwareHardeningPolicies = softwareHardeningPolicies;
            return this;
        }
        public ListApprovalProcessesResponseBodyProcessesSoftwareHardeningPolicies getSoftwareHardeningPolicies() {
            return this.softwareHardeningPolicies;
        }

    }

}
