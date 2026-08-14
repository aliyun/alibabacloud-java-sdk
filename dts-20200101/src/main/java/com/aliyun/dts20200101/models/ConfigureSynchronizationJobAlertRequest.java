// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobAlertRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone numbers of contacts for latency alerts. Separate multiple phone numbers with commas (,).</p>
     * <p>Note
     * This parameter is supported only on the China site (aliyun.com) and only Chinese mainland phone numbers are supported. You can specify up to 10 phone numbers.
     * China site (Chinese mainland) does not support phone alerts on the China site. You can configure alert rules for DTS tasks only in the CloudMonitor console.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    /**
     * <p>Specifies whether to monitor the latency status. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: yes.</li>
     * <li><strong>disable</strong>: no.</li>
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
     * <p>The threshold for triggering a latency alert. Unit: seconds. The value must be an integer. Set the threshold based on your business requirements. We recommend that you set the threshold to 10 seconds or more to avoid alert fluctuations caused by network issues or database loads.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DelayAlertStatus</strong> is set to <strong>enable</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    /**
     * <p>The mobile phone numbers of contacts for exception alerts. Separate multiple phone numbers with commas (,).</p>
     * <p>Note
     * This parameter is supported only on the China site (aliyun.com) and only Chinese mainland phone numbers are supported. You can specify up to 10 phone numbers.
     * The China site does not support phone alerts on the international site (alibabacloud.com). You can configure alert rules for DTS tasks only in the CloudMonitor console.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    /**
     * <p>Specifies whether to monitor the exception status. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: yes.</li>
     * <li><strong>disable</strong>: no.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>enable</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You must specify at least one of this parameter and the <strong>DelayAlertStatus</strong> parameter.</li>
     * <li>After you enable exception status monitoring, an alert is triggered when an exception is detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: forward.</li>
     * <li><strong>Reverse</strong>: reverse.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>Forward</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>Instance ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtskxz1170c10p****</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static ConfigureSynchronizationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobAlertRequest self = new ConfigureSynchronizationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public ConfigureSynchronizationJobAlertRequest setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public ConfigureSynchronizationJobAlertRequest setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public ConfigureSynchronizationJobAlertRequest setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public ConfigureSynchronizationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSynchronizationJobAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSynchronizationJobAlertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureSynchronizationJobAlertRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ConfigureSynchronizationJobAlertRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
