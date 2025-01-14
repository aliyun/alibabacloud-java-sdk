// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessResponseBody extends TeaModel {
    @NameInMap("Process")
    public UpdateApprovalProcessResponseBodyProcess process;

    /**
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessResponseBody self = new UpdateApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessResponseBody setProcess(UpdateApprovalProcessResponseBodyProcess process) {
        this.process = process;
        return this;
    }
    public UpdateApprovalProcessResponseBodyProcess getProcess() {
        return this.process;
    }

    public UpdateApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies self = new UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies self = new UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDlpSendPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDlpSendPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDlpSendPolicies self = new UpdateApprovalProcessResponseBodyProcessDlpSendPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies self = new UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies self = new UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies self = new UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessProcessNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Username")
        public String username;

        public static UpdateApprovalProcessResponseBodyProcessProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessProcessNodes self = new UpdateApprovalProcessResponseBodyProcessProcessNodes();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessProcessNodes setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateApprovalProcessResponseBodyProcessProcessNodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies extends TeaModel {
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies self = new UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcess extends TeaModel {
        @NameInMap("AppUninstallPolicies")
        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies;

        /**
         * <strong>example:</strong>
         * <p>2022-07-11 15:31:39</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceRegistrationPolicies")
        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies;

        @NameInMap("DlpSendPolicies")
        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies;

        @NameInMap("DomainBlacklistPolicies")
        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies;

        @NameInMap("DomainWhitelistPolicies")
        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies;

        @NameInMap("PeripheraBlockPolicies")
        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies peripheraBlockPolicies;

        /**
         * <strong>example:</strong>
         * <p>approval-process-2677fcf063f5****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> processNodes;

        @NameInMap("SoftwareBlockPolicies")
        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies;

        public static UpdateApprovalProcessResponseBodyProcess build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcess self = new UpdateApprovalProcessResponseBodyProcess();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcess setAppUninstallPolicies(UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies) {
            this.appUninstallPolicies = appUninstallPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateApprovalProcessResponseBodyProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApprovalProcessResponseBodyProcess setDeviceRegistrationPolicies(UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies) {
            this.deviceRegistrationPolicies = deviceRegistrationPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDlpSendPolicies(UpdateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies) {
            this.dlpSendPolicies = dlpSendPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDomainBlacklistPolicies(UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies) {
            this.domainBlacklistPolicies = domainBlacklistPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDomainWhitelistPolicies(UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies) {
            this.domainWhitelistPolicies = domainWhitelistPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setPeripheraBlockPolicies(UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies peripheraBlockPolicies) {
            this.peripheraBlockPolicies = peripheraBlockPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies getPeripheraBlockPolicies() {
            return this.peripheraBlockPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessNodes(java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> processNodes) {
            this.processNodes = processNodes;
            return this;
        }
        public java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        public UpdateApprovalProcessResponseBodyProcess setSoftwareBlockPolicies(UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies) {
            this.softwareBlockPolicies = softwareBlockPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

    }

}
