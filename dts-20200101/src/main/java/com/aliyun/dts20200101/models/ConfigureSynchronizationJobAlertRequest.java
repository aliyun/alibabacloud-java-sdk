// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobAlertRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone numbers that receive latency-related alerts. Separate mobile phone numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for China site (aliyun.com) users. Only mobile phone numbers in the Chinese mainland are supported. Up to 10 mobile phone numbers can be specified.</p>
     * <p>*   International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can [set alert rules for DTS tasks in the Cloud Monitor console](~~175876~~).</p>
     */
    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    /**
     * <p>Specifies whether to monitor task latency. Valid values:</p>
     * <br>
     * <p>*   **enable**: yes</p>
     * <p>*   **disable**: no</p>
     * <br>
     * <p>> </p>
     * <p>*   The default value is **enable**.</p>
     * <p>*   You must specify at least one of the DelayAlertStatus and **ErrorAlertStatus** parameters.</p>
     */
    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    /**
     * <p>The threshold for triggering latency alerts. The unit is seconds and the value must be an integer. You can set the threshold based on your business needs. To avoid delay fluctuations caused by network and database loads, we recommend that you set the threshold to more than 10 seconds.</p>
     * <br>
     * <p>>  If the **DelayAlertStatus** parameter is set to **enable**, this parameter must be specified.</p>
     */
    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    /**
     * <p>The mobile phone numbers that receive status-related alerts. Separate mobile phone numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for China site (aliyun.com) users. Only mobile phone numbers in the Chinese mainland are supported. Up to 10 mobile phone numbers can be specified.</p>
     * <p>*   International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can [set alert rules for DTS tasks in the Cloud Monitor console](~~175876~~).</p>
     */
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    /**
     * <p>Specifies whether to monitor task status. Valid values:</p>
     * <br>
     * <p>*   **enable**: yes</p>
     * <p>*   **disable**: no</p>
     * <br>
     * <p>> </p>
     * <p>*   The default value is **enable**.</p>
     * <p>*   You must specify at least one of the **DelayAlertStatus** and ErrorAlertStatus parameters.</p>
     * <p>*   If the task that you monitor enters an abnormal state, an alert is triggered.</p>
     */
    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **Forward**</p>
     * <p>*   **Reverse**</p>
     * <br>
     * <p>>  Default value: **Forward**.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance. You can call the DescribeSynchronizationJobs operation to query the instance ID.</p>
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
