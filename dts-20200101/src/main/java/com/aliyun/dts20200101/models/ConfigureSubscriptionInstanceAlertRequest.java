// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceAlertRequest extends TeaModel {
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

    /**
     * <p>The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static ConfigureSubscriptionInstanceAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceAlertRequest self = new ConfigureSubscriptionInstanceAlertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSubscriptionInstanceAlertRequest setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public ConfigureSubscriptionInstanceAlertRequest setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public ConfigureSubscriptionInstanceAlertRequest setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public ConfigureSubscriptionInstanceAlertRequest setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public ConfigureSubscriptionInstanceAlertRequest setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public ConfigureSubscriptionInstanceAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSubscriptionInstanceAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSubscriptionInstanceAlertRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
