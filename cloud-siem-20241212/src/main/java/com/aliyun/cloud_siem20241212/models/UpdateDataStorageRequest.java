// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageRequest extends TeaModel {
    /**
     * <p>The configuration version obtained from the query when modifying multi-account delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigurationVersion")
    public Long configurationVersion;

    /**
     * <p>The region for log storage.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataStorageRegionId")
    public String dataStorageRegionId;

    /**
     * <p>The global delivery switch for log management. This parameter is not available for configuration. Valid values:</p>
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
     * Note: This parameter is required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot; Specify zh or en.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The global switch for multi-account centralized delivery. If this parameter is omitted, the original storage update behavior is maintained. Do not mix this parameter with the storage region or the original delivery status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MultiAccountDeliveryEnabled")
    public Boolean multiAccountDeliveryEnabled;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
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
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The current target project obtained from the query when modifying multi-account delivery.</p>
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
