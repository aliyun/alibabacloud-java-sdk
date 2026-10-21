// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageRequest extends TeaModel {
    /**
     * <p>The version of the delivery settings on which this modification is based. Call GetDataStorage first and pass the original value of Data.DeliverySettings.ConfigurationVersion. Example 1 only demonstrates the format and cannot be used as a fixed version. This parameter is required when modifying the global switch, account selection, automatic inclusion settings, or specified member delivery. If the version is missing or has changed, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. In this case, re-query the data and then submit the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigurationVersion")
    public Long configurationVersion;

    /**
     * <p>The region where logs are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataStorageRegionId")
    public String dataStorageRegionId;

    /**
     * <p>The global delivery switch for log management. This switch is not available for configuration. Valid values:</p>
     * <ul>
     * <li>enable: Enables all delivery.</li>
     * <li>disable: Disables all delivery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DeliveryStatus")
    public String deliveryStatus;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is actually required. If it is not specified, the API returns a 400 error: \&quot;The specified Lang can not be empty.\&quot; Specify zh or en.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The global switch for multi-account centralized delivery. A value of true indicates that centralized delivery from members to the current account is enabled. A value of false indicates that centralized delivery from members to the current account is disabled. When disabled, the account selection and automatic inclusion settings are retained, and the original log type switches for the current account are independently retained. When this parameter is specified, you must also specify ConfigurationVersion and TargetProject, and omit DataStorageRegionId and DeliveryStatus. If this parameter is omitted, the storage region modification process is used. Enabling this switch for the first time initializes the account scope for log types and the automatic inclusion settings.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MultiAccountDeliveryEnabled")
    public Boolean multiAccountDeliveryEnabled;

    /**
     * <p>The region of the data management center for threat analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The name of the current Simple Log Service project for log delivery. First invoke GetDataStorage and pass the original value of Data.DeliverySettings.TargetProject. This parameter is used to verify the target of this modification, not to specify a new project. This parameter is required when modifying the global switch, account selection, automatic inclusion settings, or specified member delivery. If this parameter is missing or differs from the current target, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. Replace the account UID and region in the example with the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
     */
    @NameInMap("TargetProject")
    public String targetProject;

    public static UpdateDataStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageRequest self = new UpdateDataStorageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageRequest setConfigurationVersion(Long configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    public UpdateDataStorageRequest setDataStorageRegionId(String dataStorageRegionId) {
        this.dataStorageRegionId = dataStorageRegionId;
        return this;
    }
    public String getDataStorageRegionId() {
        return this.dataStorageRegionId;
    }

    public UpdateDataStorageRequest setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public UpdateDataStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageRequest setMultiAccountDeliveryEnabled(Boolean multiAccountDeliveryEnabled) {
        this.multiAccountDeliveryEnabled = multiAccountDeliveryEnabled;
        return this;
    }
    public Boolean getMultiAccountDeliveryEnabled() {
        return this.multiAccountDeliveryEnabled;
    }

    public UpdateDataStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateDataStorageRequest setTargetProject(String targetProject) {
        this.targetProject = targetProject;
        return this;
    }
    public String getTargetProject() {
        return this.targetProject;
    }

}
