// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobAlertRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter is about to be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone numbers of the contacts to receive latency alerts. Separate multiple mobile phone numbers with commas (,).</p>
     * <p>This parameter is supported only on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.
     * The international site does not support mobile phone alerts. You can only configure alert rules for DTS tasks by using CloudMonitor.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    /**
     * <p>Specifies whether to monitor the latency status. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: Yes.</li>
     * <li><strong>disable</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>enable</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You must specify at least one of this parameter and the <strong>ErrorAlertStatus</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    /**
     * <p>The threshold for triggering a latency alert. The value must be an integer in seconds. You can set the threshold based on your business requirements. Set the threshold to 10 seconds or more to avoid alert fluctuations caused by network issues or database loads.</p>
     * <blockquote>
     * <p>This parameter is required when the <strong>DelayAlertStatus</strong> parameter is set to <strong>enable</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    /**
     * <p>The mobile phone numbers of the contacts to receive abnormal status alerts. Separate multiple mobile phone numbers with commas (,).</p>
     * <p>This parameter is supported only on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.
     * The international site does not support mobile phone alerts. You can only configure alert rules for DTS tasks by using CloudMonitor.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    /**
     * <p>Specifies whether to monitor the abnormal status. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: Yes.</li>
     * <li><strong>disable</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>enable</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You must specify at least one of this parameter and the <strong>DelayAlertStatus</strong> parameter.</li>
     * <li>After the abnormal status monitoring feature is enabled, an alert is triggered if an exception is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    /**
     * <p>Instance ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtslb9113qq11n****</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see the list of supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ConfigureMigrationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobAlertRequest self = new ConfigureMigrationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureMigrationJobAlertRequest setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public ConfigureMigrationJobAlertRequest setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public ConfigureMigrationJobAlertRequest setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public ConfigureMigrationJobAlertRequest setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public ConfigureMigrationJobAlertRequest setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public ConfigureMigrationJobAlertRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public ConfigureMigrationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureMigrationJobAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureMigrationJobAlertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
