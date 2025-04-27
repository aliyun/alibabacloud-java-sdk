// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesResponseBody extends TeaModel {
    @NameInMap("Processes")
    public java.util.List<ListApprovalProcessesResponseBodyProcesses> processes;

    /**
     * <strong>example:</strong>
     * <p>7E39C33B-F565-55C6-ACC2-953FCE7DA7D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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

    public static class ListApprovalProcessesResponseBodyProcessesProcessNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

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
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
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
        @NameInMap("AppUninstallPolicies")
        public ListApprovalProcessesResponseBodyProcessesAppUninstallPolicies appUninstallPolicies;

        /**
         * <strong>example:</strong>
         * <p>2024-02-27 14:04:27</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceRegistrationPolicies")
        public ListApprovalProcessesResponseBodyProcessesDeviceRegistrationPolicies deviceRegistrationPolicies;

        @NameInMap("DlpSendPolicies")
        public ListApprovalProcessesResponseBodyProcessesDlpSendPolicies dlpSendPolicies;

        @NameInMap("DomainBlacklistPolicies")
        public ListApprovalProcessesResponseBodyProcessesDomainBlacklistPolicies domainBlacklistPolicies;

        @NameInMap("DomainWhitelistPolicies")
        public ListApprovalProcessesResponseBodyProcessesDomainWhitelistPolicies domainWhitelistPolicies;

        @NameInMap("EndpointHardeningPolicies")
        public ListApprovalProcessesResponseBodyProcessesEndpointHardeningPolicies endpointHardeningPolicies;

        @NameInMap("PeripheralBlockPolicies")
        public ListApprovalProcessesResponseBodyProcessesPeripheralBlockPolicies peripheralBlockPolicies;

        /**
         * <strong>example:</strong>
         * <p>approval-process-35ee09077ee9****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<ListApprovalProcessesResponseBodyProcessesProcessNodes>> processNodes;

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
