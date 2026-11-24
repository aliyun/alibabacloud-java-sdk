// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageDeliveryRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add subsequent new and available managed members to the account selection for the log type. A value of true indicates that the feature is enabled. A value of false indicates that the feature is disabled. Disabling the feature does not remove selected members. If this parameter is omitted, the original value is retained. You must also specify LogCode, ConfigurationVersion, and TargetProject. You can update this parameter together with SelectedAccountIds. You cannot specify LogDeliveryStatus or the member SubUserId at the same time. The actual delivery is also controlled by the global switch for multi-account delivery and the delivery switch for the log type.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoIncludeNewAccounts")
    public Boolean autoIncludeNewAccounts;

    /**
     * <p>The version of the delivery settings on which the current modification is based. Call GetDataStorage first and pass the original value of Data.DeliverySettings.ConfigurationVersion. Example 1 only shows the format and cannot be used as a fixed version. This parameter is required when you modify the global switch, account selection, auto-inclusion settings, or specified member delivery. If the version is missing or has changed, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. In this case, query the version again before you submit the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigurationVersion")
    public Long configurationVersion;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * This parameter is required. If this parameter is not specified, the API returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The log code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis-log-login</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The log delivery status. Valid values:</p>
     * <ul>
     * <li>enable: Enables delivery.</li>
     * <li>disable: Disables delivery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("LogDeliveryStatus")
    public String logDeliveryStatus;

    /**
     * <p>The region where the data management center for threat analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The complete list of selected accounts for the log type. Each element is a decimal UID string. The list must include Data.DeliverySettings.DaAccountId (the current account) and can contain up to 10,000 items. A new member must be in the Accounts list returned by GetDataStorage and have Authorized set to true. If only the current account is retained, specify the UID of the current account. Do not use an empty string or an empty array. If this parameter is omitted, the original selection is retained. For HTTP requests, use the comma-separated format of array(simple): SelectedAccountIds=1234567890123456,1234567890123457. For a single account, specify only one UID. Do not use SelectedAccountIds.1/.2 or a JSON array string. You must also specify ConfigurationVersion and TargetProject, and omit LogDeliveryStatus and the member SubUserId.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456,1234567890123457</p>
     */
    @NameInMap("SelectedAccountIds")
    public java.util.List<String> selectedAccountIds;

    /**
     * <p>The UID of the source Alibaba Cloud account, which is a decimal integer. If this parameter is omitted or set to the UID of the current account, the delivery settings of the current account are modified. If a member UID is specified, the expected delivery status in the current configuration is applied only to the member. In this case, you must also specify LogDeliveryStatus, ConfigurationVersion, and TargetProject. The member must be within the selection scope of the log type or have existing delivery records. You must omit this parameter when you save the account selection or auto-inclusion settings. You cannot specify the UID of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123457</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    /**
     * <p>The name of the current Simple Log Service project for log delivery. Invoke GetDataStorage first and pass the original value of Data.DeliverySettings.TargetProject. This parameter is used to verify the target of the current modification, not to specify a new project. This parameter is required when you modify the global switch, account selection, auto-inclusion settings, or specified member log delivery. If this parameter is missing or different from the current target, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. Replace the account UID and region in the example with the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
     */
    @NameInMap("TargetProject")
    public String targetProject;

    public static UpdateDataStorageDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageDeliveryRequest self = new UpdateDataStorageDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageDeliveryRequest setAutoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
        this.autoIncludeNewAccounts = autoIncludeNewAccounts;
        return this;
    }
    public Boolean getAutoIncludeNewAccounts() {
        return this.autoIncludeNewAccounts;
    }

    public UpdateDataStorageDeliveryRequest setConfigurationVersion(Long configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    public UpdateDataStorageDeliveryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public UpdateDataStorageDeliveryRequest setLogDeliveryStatus(String logDeliveryStatus) {
        this.logDeliveryStatus = logDeliveryStatus;
        return this;
    }
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    public UpdateDataStorageDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageDeliveryRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateDataStorageDeliveryRequest setSelectedAccountIds(java.util.List<String> selectedAccountIds) {
        this.selectedAccountIds = selectedAccountIds;
        return this;
    }
    public java.util.List<String> getSelectedAccountIds() {
        return this.selectedAccountIds;
    }

    public UpdateDataStorageDeliveryRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

    public UpdateDataStorageDeliveryRequest setTargetProject(String targetProject) {
        this.targetProject = targetProject;
        return this;
    }
    public String getTargetProject() {
        return this.targetProject;
    }

}
