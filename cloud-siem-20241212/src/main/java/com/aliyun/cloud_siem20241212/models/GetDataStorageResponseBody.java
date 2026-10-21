// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataStorageResponseBody extends TeaModel {
    /**
     * <p>The detailed information returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DataStorageRegionId&quot;:&quot;cn-shanghai&quot;,&quot;DataStorageTotalCapacity&quot;:1000,&quot;DataStorageUsedCapacity&quot;:41.2,&quot;LogProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;SasLogStores&quot;:[{&quot;LogName&quot;:&quot;Client events&quot;,&quot;LogStoreName&quot;:&quot;aegis-log-client&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogStoreTtl&quot;:180,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00&quot;,&quot;LogDeliveryPermission&quot;:&quot;allow&quot;,&quot;LogDeliveryGroup&quot;:&quot;host&quot;,&quot;LogSearchConditions&quot;:&quot;[{\&quot;<strong>topic</strong>\&quot;:\&quot;aegis-log-client\&quot;}]&quot;,&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;LogStoreExisted&quot;:true,&quot;UsedCapacity&quot;:10.3,&quot;AccountDeliveries&quot;:[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]}],&quot;NormalizationLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;UnusedLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;cloud-siem&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;RecordLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;alert-record&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;NormalizationLogViews&quot;:[{&quot;CategoryName&quot;:&quot;Endpoint security&quot;,&quot;ActivityName&quot;:&quot;Host activity&quot;,&quot;LogViewName&quot;:&quot;host_activity&quot;,&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;DetectionRuleReferenceCount&quot;:1,&quot;DetectionRuleReferenceProductIds&quot;:[&quot;sas&quot;],&quot;LogSearchConditions&quot;:&quot;[{\&quot;SCHEMA\&quot;:\&quot;host-activity\&quot;}]&quot;,&quot;LogViewExisted&quot;:true}],&quot;ColdStorageUsedCapacity&quot;:0.0,&quot;DataStorageUsedCapacityDetail&quot;:&quot;{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:41.2,\&quot;usedColdStorageCapacity\&quot;:0.0,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;cn-shanghai\&quot;:41.2},\&quot;usedColdStorageCapacityDetail\&quot;:{\&quot;cn-shanghai\&quot;:0.0}}&quot;,&quot;DataStorageRegionPermission&quot;:&quot;allow&quot;,&quot;LogServiceDisabled&quot;:false,&quot;LogProjectStateChangeAllowed&quot;:true,&quot;LogProjectState&quot;:&quot;ACTIVE&quot;,&quot;DeliverySettings&quot;:{&quot;PrerequisiteEnabled&quot;:true,&quot;CanConfigure&quot;:true,&quot;Enabled&quot;:true,&quot;Initialized&quot;:true,&quot;DaAccountId&quot;:&quot;1234567890123456&quot;,&quot;TargetProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;TargetRegion&quot;:&quot;cn-shanghai&quot;,&quot;ConfigurationVersion&quot;:1,&quot;Accounts&quot;:[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}],&quot;Types&quot;:[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]}}</p>
     */
    @NameInMap("Data")
    public GetDataStorageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81FB0DEA-52C1-55A0-8631-8E1B9A9D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataStorageResponseBody self = new GetDataStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataStorageResponseBody setData(GetDataStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataStorageResponseBodyData getData() {
        return this.data;
    }

    public GetDataStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataStorageResponseBodyDataDeliverySettingsAccounts extends TeaModel {
        /**
         * <p>The UID of the source Alibaba Cloud account, which is a decimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The display name of the account. If the name is missing, the UID string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Specifies whether the account has the authorization required for log delivery. This parameter must be set to true when you add a selected member.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authorized")
        public Boolean authorized;

        /**
         * <p>Specifies whether the account is the current management and delivery target account, which is the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DaAccount")
        public Boolean daAccount;

        public static GetDataStorageResponseBodyDataDeliverySettingsAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataDeliverySettingsAccounts self = new GetDataStorageResponseBodyDataDeliverySettingsAccounts();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataDeliverySettingsAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsAccounts setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsAccounts setDaAccount(Boolean daAccount) {
            this.daAccount = daAccount;
            return this;
        }
        public Boolean getDaAccount() {
            return this.daAccount;
        }

    }

    public static class GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions extends TeaModel {
        /**
         * <p>The UID of the source account for this delivery record, which is a decimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123457</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>A reserved compatibility field. The current implementation does not populate historical execution error codes, so this field is usually empty or not returned. If execution fails, read the error code returned by the corresponding write operation.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The recorded delivery status. RUNNING indicates that the status is recorded as enabled after the last successful operation. STOPPED indicates that the status is recorded as disabled. This field does not indicate real-time log arrival.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time of the delivery status, which is a UNIX timestamp in milliseconds. This field is empty or not returned if the record has no update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1792399200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions self = new GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetDataStorageResponseBodyDataDeliverySettingsTypes extends TeaModel {
        /**
         * <p>Specifies whether to automatically add subsequent new and available managed members to the selection scope of this log type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoIncludeNewAccounts")
        public Boolean autoIncludeNewAccounts;

        /**
         * <p>The status list of existing source delivery records for this log type.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Executions")
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions> executions;

        /**
         * <p>The unique identifier of the log type, which corresponds to UpdateDataStorageDelivery.LogCode.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-client</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The array of UIDs of the selected source accounts for this log type, including the current account. The response is a JSON string array. When you write an array(simple) request, you must serialize it into comma-separated values.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1234567890123456&quot;]</p>
         */
        @NameInMap("SelectedAccountIds")
        public java.util.List<String> selectedAccountIds;

        public static GetDataStorageResponseBodyDataDeliverySettingsTypes build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataDeliverySettingsTypes self = new GetDataStorageResponseBodyDataDeliverySettingsTypes();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypes setAutoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
            this.autoIncludeNewAccounts = autoIncludeNewAccounts;
            return this;
        }
        public Boolean getAutoIncludeNewAccounts() {
            return this.autoIncludeNewAccounts;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypes setExecutions(java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions> executions) {
            this.executions = executions;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypesExecutions> getExecutions() {
            return this.executions;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypes setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public GetDataStorageResponseBodyDataDeliverySettingsTypes setSelectedAccountIds(java.util.List<String> selectedAccountIds) {
            this.selectedAccountIds = selectedAccountIds;
            return this;
        }
        public java.util.List<String> getSelectedAccountIds() {
            return this.selectedAccountIds;
        }

    }

    public static class GetDataStorageResponseBodyDataDeliverySettings extends TeaModel {
        /**
         * <p>The account directory of the current account and managed member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}]</p>
         */
        @NameInMap("Accounts")
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsAccounts> accounts;

        /**
         * <p>Specifies whether the current account meets the conditions for delivery setting operations. This is determined based on authorization, target project availability, capacity orders, and the current account identity. The PrerequisiteEnabled parameter must also be met.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanConfigure")
        public Boolean canConfigure;

        /**
         * <p>The current version of the delivery settings. When you modify multi-account configurations or specify member delivery, pass this value back as ConfigurationVersion. You must query this value again after each modification and cannot use a fixed example value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigurationVersion")
        public Long configurationVersion;

        /**
         * <p>The UID of the current management and delivery target account, which is a decimal string. This is also the current account that is permanently retained in the account selection list.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("DaAccountId")
        public String daAccountId;

        /**
         * <p>The master switch for the saved multi-account centralized delivery. A value of true indicates that the switch is turned on. A value of false indicates that the switch is turned off.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether the initialization of the account scope and automatic inclusion settings is completed when the feature is enabled for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Initialized")
        public Boolean initialized;

        /**
         * <p>Specifies whether the prerequisite of enabling multi-account security management in Security Center is met.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PrerequisiteEnabled")
        public Boolean prerequisiteEnabled;

        /**
         * <p>The name of the current Simple Log Service project for centralized delivery. When you modify multi-account settings or specify member delivery, pass this value back as the TargetProject request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
         */
        @NameInMap("TargetProject")
        public String targetProject;

        /**
         * <p>The region ID of the current Simple Log Service project for centralized delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("TargetRegion")
        public String targetRegion;

        /**
         * <p>The account selection, automatic inclusion settings, and existing delivery status categorized by log type.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]</p>
         */
        @NameInMap("Types")
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypes> types;

        /**
         * <p>The reason code for being unconfigurable. Valid values: DA_UNAUTHORIZED (the management account is not authorized), TARGET_PROJECT_UNAVAILABLE (the target project is unavailable), LOG_CAPACITY_UNAVAILABLE (no valid capacity order exists), and NOT_CURRENT_ACCOUNT (the operation is not performed by the current account). This field is empty or not returned if the conditions are met.</p>
         * 
         * <strong>example:</strong>
         * <p>DA_UNAUTHORIZED</p>
         */
        @NameInMap("UnavailableReason")
        public String unavailableReason;

        public static GetDataStorageResponseBodyDataDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataDeliverySettings self = new GetDataStorageResponseBodyDataDeliverySettings();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataDeliverySettings setAccounts(java.util.List<GetDataStorageResponseBodyDataDeliverySettingsAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsAccounts> getAccounts() {
            return this.accounts;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setCanConfigure(Boolean canConfigure) {
            this.canConfigure = canConfigure;
            return this;
        }
        public Boolean getCanConfigure() {
            return this.canConfigure;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setConfigurationVersion(Long configurationVersion) {
            this.configurationVersion = configurationVersion;
            return this;
        }
        public Long getConfigurationVersion() {
            return this.configurationVersion;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setDaAccountId(String daAccountId) {
            this.daAccountId = daAccountId;
            return this;
        }
        public String getDaAccountId() {
            return this.daAccountId;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setInitialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }
        public Boolean getInitialized() {
            return this.initialized;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setPrerequisiteEnabled(Boolean prerequisiteEnabled) {
            this.prerequisiteEnabled = prerequisiteEnabled;
            return this;
        }
        public Boolean getPrerequisiteEnabled() {
            return this.prerequisiteEnabled;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setTypes(java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypes> types) {
            this.types = types;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataDeliverySettingsTypes> getTypes() {
            return this.types;
        }

        public GetDataStorageResponseBodyDataDeliverySettings setUnavailableReason(String unavailableReason) {
            this.unavailableReason = unavailableReason;
            return this;
        }
        public String getUnavailableReason() {
            return this.unavailableReason;
        }

    }

    public static class GetDataStorageResponseBodyDataNormalizationLogStores extends TeaModel {
        /**
         * <p>The name of the Logstore that stores normalized data.</p>
         * 
         * <strong>example:</strong>
         * <p>vulnerability-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The storage duration of the normalized data.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        /**
         * <p>The amount of hot storage used.</p>
         * 
         * <strong>example:</strong>
         * <p>10.333</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetDataStorageResponseBodyDataNormalizationLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataNormalizationLogStores self = new GetDataStorageResponseBodyDataNormalizationLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataNormalizationLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public GetDataStorageResponseBodyDataNormalizationLogStores setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

    public static class GetDataStorageResponseBodyDataNormalizationLogViews extends TeaModel {
        /**
         * <p>The log type of the normalized logs.</p>
         * 
         * <strong>example:</strong>
         * <p>API security risk log</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The category of the normalized logs.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Category</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The number of times this normalized dataset is referenced in Threat Analysis and Response.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DetectionRuleReferenceCount")
        public Integer detectionRuleReferenceCount;

        /**
         * <p>The list of products that reference this normalized dataset in Threat Analysis and Response.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sas&quot;]</p>
         */
        @NameInMap("DetectionRuleReferenceProductIds")
        public java.util.List<String> detectionRuleReferenceProductIds;

        /**
         * <p>The query statement used to query log types in the normalized dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;SCHEMA\&quot;:\&quot;AZURE_ACTIVE_DIRECTORY_AUDIT_ACTIVITY\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <p>The Logstore where Threat Analysis and Response stores normalized logs.</p>
         * 
         * <strong>example:</strong>
         * <p>risk-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>Specifies whether the normalized dataset exists. Valid values:</p>
         * <ul>
         * <li>true: The dataset exists.</li>
         * <li>false: The dataset does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogViewExisted")
        public Boolean logViewExisted;

        /**
         * <p>The name of the normalized dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>risk_activity</p>
         */
        @NameInMap("LogViewName")
        public String logViewName;

        public static GetDataStorageResponseBodyDataNormalizationLogViews build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataNormalizationLogViews self = new GetDataStorageResponseBodyDataNormalizationLogViews();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setDetectionRuleReferenceCount(Integer detectionRuleReferenceCount) {
            this.detectionRuleReferenceCount = detectionRuleReferenceCount;
            return this;
        }
        public Integer getDetectionRuleReferenceCount() {
            return this.detectionRuleReferenceCount;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setDetectionRuleReferenceProductIds(java.util.List<String> detectionRuleReferenceProductIds) {
            this.detectionRuleReferenceProductIds = detectionRuleReferenceProductIds;
            return this;
        }
        public java.util.List<String> getDetectionRuleReferenceProductIds() {
            return this.detectionRuleReferenceProductIds;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogSearchConditions(String logSearchConditions) {
            this.logSearchConditions = logSearchConditions;
            return this;
        }
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogViewExisted(Boolean logViewExisted) {
            this.logViewExisted = logViewExisted;
            return this;
        }
        public Boolean getLogViewExisted() {
            return this.logViewExisted;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogViewName(String logViewName) {
            this.logViewName = logViewName;
            return this;
        }
        public String getLogViewName() {
            return this.logViewName;
        }

    }

    public static class GetDataStorageResponseBodyDataRecordLogStores extends TeaModel {
        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>alert-record</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The TTL of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        /**
         * <p>The used capacity of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>11.111</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetDataStorageResponseBodyDataRecordLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataRecordLogStores self = new GetDataStorageResponseBodyDataRecordLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataRecordLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataRecordLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public GetDataStorageResponseBodyDataRecordLogStores setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

    public static class GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries extends TeaModel {
        /**
         * <p>The UID of the source cloud account. This field is an int64 number.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The display name of the source account. If the name is not obtained, the account UID string is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the account is the current management or target account (the current account). A value of true indicates the current account. A value of false indicates a member source account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDaAccount")
        public Boolean isDaAccount;

        /**
         * <p>The recorded delivery status of the source account. Valid values:</p>
         * <ul>
         * <li>enable: Enabled.</li>
         * <li>disable: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("LogDeliveryStatus")
        public String logDeliveryStatus;

        /**
         * <p>The last update time of the delivery status for the source account. If no record is generated, this field is empty or not returned.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19T14:00:00Z</p>
         */
        @NameInMap("LogDeliveryUpdateTime")
        public String logDeliveryUpdateTime;

        public static GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries self = new GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries setIsDaAccount(Boolean isDaAccount) {
            this.isDaAccount = isDaAccount;
            return this;
        }
        public Boolean getIsDaAccount() {
            return this.isDaAccount;
        }

        public GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries setLogDeliveryStatus(String logDeliveryStatus) {
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        public GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries setLogDeliveryUpdateTime(String logDeliveryUpdateTime) {
            this.logDeliveryUpdateTime = logDeliveryUpdateTime;
            return this;
        }
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

    }

    public static class GetDataStorageResponseBodyDataSasLogStores extends TeaModel {
        /**
         * <p>The delivery records of this log type expanded by source account, including the current account and member accounts with existing records.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]</p>
         */
        @NameInMap("AccountDeliveries")
        public java.util.List<GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries> accountDeliveries;

        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-net-block</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The group to which the log belongs. Valid values:</p>
         * <ul>
         * <li>host: Host logs.</li>
         * <li>security: Security logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("LogDeliveryGroup")
        public String logDeliveryGroup;

        /**
         * <p>Specifies whether the log delivery switch can be operated. Log delivery is unavailable if the service is not purchased. Valid values:</p>
         * <ul>
         * <li>allow: Allowed.</li>
         * <li>deny: Not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("LogDeliveryPermission")
        public String logDeliveryPermission;

        /**
         * <p>The log delivery status. Valid values:</p>
         * <ul>
         * <li>enable: Log delivery is enabled.</li>
         * <li>disable: Log delivery is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("LogDeliveryStatus")
        public String logDeliveryStatus;

        /**
         * <p>The time of the last log delivery operation. The format is YYYY-MM-DDTHH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-16T15:10:29</p>
         */
        @NameInMap("LogDeliveryUpdateTime")
        public String logDeliveryUpdateTime;

        /**
         * <p>The log name.</p>
         * 
         * <strong>example:</strong>
         * <p>Process Snapshot</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The default query conditions for the log. When multiple logs are stored in a single Logstore, you must use query conditions to perform a log query for a specific log.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;<strong>topic</strong>\&quot;:\&quot;sas-net-block\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <p>Indicates whether the Logstore where the log is stored exists. Valid values:</p>
         * <ul>
         * <li>true: Exists.</li>
         * <li>false: Does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogStoreExisted")
        public Boolean logStoreExisted;

        /**
         * <p>The name of the Logstore where the log is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-security-log</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The storage duration of the Logstore where the log is stored. The minimum storage duration is 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        /**
         * <p>The amount of hot storage used.</p>
         * 
         * <strong>example:</strong>
         * <p>10.333</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetDataStorageResponseBodyDataSasLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataSasLogStores self = new GetDataStorageResponseBodyDataSasLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataSasLogStores setAccountDeliveries(java.util.List<GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries> accountDeliveries) {
            this.accountDeliveries = accountDeliveries;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataSasLogStoresAccountDeliveries> getAccountDeliveries() {
            return this.accountDeliveries;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryGroup(String logDeliveryGroup) {
            this.logDeliveryGroup = logDeliveryGroup;
            return this;
        }
        public String getLogDeliveryGroup() {
            return this.logDeliveryGroup;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryPermission(String logDeliveryPermission) {
            this.logDeliveryPermission = logDeliveryPermission;
            return this;
        }
        public String getLogDeliveryPermission() {
            return this.logDeliveryPermission;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryStatus(String logDeliveryStatus) {
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryUpdateTime(String logDeliveryUpdateTime) {
            this.logDeliveryUpdateTime = logDeliveryUpdateTime;
            return this;
        }
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogSearchConditions(String logSearchConditions) {
            this.logSearchConditions = logSearchConditions;
            return this;
        }
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreExisted(Boolean logStoreExisted) {
            this.logStoreExisted = logStoreExisted;
            return this;
        }
        public Boolean getLogStoreExisted() {
            return this.logStoreExisted;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public GetDataStorageResponseBodyDataSasLogStores setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

    public static class GetDataStorageResponseBodyDataUnusedLogStores extends TeaModel {
        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-siem</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The data retention period.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        /**
         * <p>The amount of hot storage used.</p>
         * 
         * <strong>example:</strong>
         * <p>10.333</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetDataStorageResponseBodyDataUnusedLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataUnusedLogStores self = new GetDataStorageResponseBodyDataUnusedLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataUnusedLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataUnusedLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public GetDataStorageResponseBodyDataUnusedLogStores setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

    public static class GetDataStorageResponseBodyData extends TeaModel {
        /**
         * <p>The amount of cold storage used for user logs.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("ColdStorageUsedCapacity")
        public Double coldStorageUsedCapacity;

        /**
         * <p>The storage region of user logs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DataStorageRegionId")
        public String dataStorageRegionId;

        /**
         * <p>Specifies whether the storage region can be modified. By default, the region cannot be modified. You can contact the product manager to reset the region, and the region can be reset only once. Valid values:</p>
         * <ul>
         * <li>allow: The region can be modified.</li>
         * <li>deny: The region cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("DataStorageRegionPermission")
        public String dataStorageRegionPermission;

        /**
         * <p>The storage capacity purchased for subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataStorageTotalCapacity")
        public Long dataStorageTotalCapacity;

        /**
         * <p>The amount of storage used in user log management.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("DataStorageUsedCapacity")
        public Double dataStorageUsedCapacity;

        /**
         * <p>The storage usage details of the log management user.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:4.2,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;ap-southeast-1\&quot;:4.2,\&quot;cn-shenzhen\&quot;:0.0,\&quot;cn-shanghai\&quot;:0.0}}</p>
         */
        @NameInMap("DataStorageUsedCapacityDetail")
        public String dataStorageUsedCapacityDetail;

        /**
         * <p>The multi-account delivery settings for the current storage resources. Returned when the query is successful. If the read operation fails, see DeliverySettingsError.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PrerequisiteEnabled&quot;:true,&quot;CanConfigure&quot;:true,&quot;Enabled&quot;:true,&quot;Initialized&quot;:true,&quot;DaAccountId&quot;:&quot;1234567890123456&quot;,&quot;TargetProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;TargetRegion&quot;:&quot;cn-shanghai&quot;,&quot;ConfigurationVersion&quot;:1,&quot;Accounts&quot;:[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}],&quot;Types&quot;:[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]}</p>
         */
        @NameInMap("DeliverySettings")
        public GetDataStorageResponseBodyDataDeliverySettings deliverySettings;

        /**
         * <p>The read error code for the optional multi-account delivery settings. If the read operation fails, DELIVERY_SETTINGS_UNAVAILABLE is returned. If the read operation is successful, this field is empty or not returned, and does not affect other storage fields.</p>
         * 
         * <strong>example:</strong>
         * <p>DELIVERY_SETTINGS_UNAVAILABLE</p>
         */
        @NameInMap("DeliverySettingsError")
        public String deliverySettingsError;

        /**
         * <p>The name of the Simple Log Service project where user logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-171835723111****-cn-shanghai</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The status of the log project.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("LogProjectState")
        public String logProjectState;

        /**
         * <p>Specifies whether the status of the log project can be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogProjectStateChangeAllowed")
        public Boolean logProjectStateChangeAllowed;

        /**
         * <p>Specifies whether Simple Log Service is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LogServiceDisabled")
        public Boolean logServiceDisabled;

        /**
         * <p>The details of the Logstores for normalized data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
         */
        @NameInMap("NormalizationLogStores")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> normalizationLogStores;

        /**
         * <p>The details of the normalized datasets.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;CategoryName&quot;:&quot;Endpoint security&quot;,&quot;ActivityName&quot;:&quot;Host activity&quot;,&quot;LogViewName&quot;:&quot;host_activity&quot;,&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;DetectionRuleReferenceCount&quot;:1,&quot;DetectionRuleReferenceProductIds&quot;:[&quot;sas&quot;],&quot;LogSearchConditions&quot;:&quot;[{\&quot;SCHEMA\&quot;:\&quot;host-activity\&quot;}]&quot;,&quot;LogViewExisted&quot;:true}]</p>
         */
        @NameInMap("NormalizationLogViews")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> normalizationLogViews;

        /**
         * <p>The list of Record Logstores.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogStoreName&quot;:&quot;alert-record&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
         */
        @NameInMap("RecordLogStores")
        public java.util.List<GetDataStorageResponseBodyDataRecordLogStores> recordLogStores;

        /**
         * <p>The storage details of raw logs in Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogName&quot;:&quot;Client events&quot;,&quot;LogStoreName&quot;:&quot;aegis-log-client&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogStoreTtl&quot;:180,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00&quot;,&quot;LogDeliveryPermission&quot;:&quot;allow&quot;,&quot;LogDeliveryGroup&quot;:&quot;host&quot;,&quot;LogSearchConditions&quot;:&quot;[{\&quot;<strong>topic</strong>\&quot;:\&quot;aegis-log-client\&quot;}]&quot;,&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;LogStoreExisted&quot;:true,&quot;UsedCapacity&quot;:10.3,&quot;AccountDeliveries&quot;:[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]}]</p>
         */
        @NameInMap("SasLogStores")
        public java.util.List<GetDataStorageResponseBodyDataSasLogStores> sasLogStores;

        /**
         * <p>The list of legacy Logstores in SIEM V1.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogStoreName&quot;:&quot;cloud-siem&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
         */
        @NameInMap("UnusedLogStores")
        public java.util.List<GetDataStorageResponseBodyDataUnusedLogStores> unusedLogStores;

        public static GetDataStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyData self = new GetDataStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyData setColdStorageUsedCapacity(Double coldStorageUsedCapacity) {
            this.coldStorageUsedCapacity = coldStorageUsedCapacity;
            return this;
        }
        public Double getColdStorageUsedCapacity() {
            return this.coldStorageUsedCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageRegionId(String dataStorageRegionId) {
            this.dataStorageRegionId = dataStorageRegionId;
            return this;
        }
        public String getDataStorageRegionId() {
            return this.dataStorageRegionId;
        }

        public GetDataStorageResponseBodyData setDataStorageRegionPermission(String dataStorageRegionPermission) {
            this.dataStorageRegionPermission = dataStorageRegionPermission;
            return this;
        }
        public String getDataStorageRegionPermission() {
            return this.dataStorageRegionPermission;
        }

        public GetDataStorageResponseBodyData setDataStorageTotalCapacity(Long dataStorageTotalCapacity) {
            this.dataStorageTotalCapacity = dataStorageTotalCapacity;
            return this;
        }
        public Long getDataStorageTotalCapacity() {
            return this.dataStorageTotalCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageUsedCapacity(Double dataStorageUsedCapacity) {
            this.dataStorageUsedCapacity = dataStorageUsedCapacity;
            return this;
        }
        public Double getDataStorageUsedCapacity() {
            return this.dataStorageUsedCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageUsedCapacityDetail(String dataStorageUsedCapacityDetail) {
            this.dataStorageUsedCapacityDetail = dataStorageUsedCapacityDetail;
            return this;
        }
        public String getDataStorageUsedCapacityDetail() {
            return this.dataStorageUsedCapacityDetail;
        }

        public GetDataStorageResponseBodyData setDeliverySettings(GetDataStorageResponseBodyDataDeliverySettings deliverySettings) {
            this.deliverySettings = deliverySettings;
            return this;
        }
        public GetDataStorageResponseBodyDataDeliverySettings getDeliverySettings() {
            return this.deliverySettings;
        }

        public GetDataStorageResponseBodyData setDeliverySettingsError(String deliverySettingsError) {
            this.deliverySettingsError = deliverySettingsError;
            return this;
        }
        public String getDeliverySettingsError() {
            return this.deliverySettingsError;
        }

        public GetDataStorageResponseBodyData setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public GetDataStorageResponseBodyData setLogProjectState(String logProjectState) {
            this.logProjectState = logProjectState;
            return this;
        }
        public String getLogProjectState() {
            return this.logProjectState;
        }

        public GetDataStorageResponseBodyData setLogProjectStateChangeAllowed(Boolean logProjectStateChangeAllowed) {
            this.logProjectStateChangeAllowed = logProjectStateChangeAllowed;
            return this;
        }
        public Boolean getLogProjectStateChangeAllowed() {
            return this.logProjectStateChangeAllowed;
        }

        public GetDataStorageResponseBodyData setLogServiceDisabled(Boolean logServiceDisabled) {
            this.logServiceDisabled = logServiceDisabled;
            return this;
        }
        public Boolean getLogServiceDisabled() {
            return this.logServiceDisabled;
        }

        public GetDataStorageResponseBodyData setNormalizationLogStores(java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> normalizationLogStores) {
            this.normalizationLogStores = normalizationLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> getNormalizationLogStores() {
            return this.normalizationLogStores;
        }

        public GetDataStorageResponseBodyData setNormalizationLogViews(java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> normalizationLogViews) {
            this.normalizationLogViews = normalizationLogViews;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> getNormalizationLogViews() {
            return this.normalizationLogViews;
        }

        public GetDataStorageResponseBodyData setRecordLogStores(java.util.List<GetDataStorageResponseBodyDataRecordLogStores> recordLogStores) {
            this.recordLogStores = recordLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataRecordLogStores> getRecordLogStores() {
            return this.recordLogStores;
        }

        public GetDataStorageResponseBodyData setSasLogStores(java.util.List<GetDataStorageResponseBodyDataSasLogStores> sasLogStores) {
            this.sasLogStores = sasLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataSasLogStores> getSasLogStores() {
            return this.sasLogStores;
        }

        public GetDataStorageResponseBodyData setUnusedLogStores(java.util.List<GetDataStorageResponseBodyDataUnusedLogStores> unusedLogStores) {
            this.unusedLogStores = unusedLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataUnusedLogStores> getUnusedLogStores() {
            return this.unusedLogStores;
        }

    }

}
