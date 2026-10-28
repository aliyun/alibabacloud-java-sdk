// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceAlertRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The mobile phone numbers of the contacts to receive latency alerts. Separate multiple mobile phone numbers with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the Alibaba Cloud China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The Alibaba Cloud International site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks by using CloudMonitor</a>.</li>
     * </ul>
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
     * <li>You must specify at least one of the <strong>DelayAlertStatus</strong> and <strong>ErrorAlertStatus</strong> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    /**
     * <p>The threshold for triggering a latency alert. Unit: seconds. The value must be an integer. You can set the threshold based on your business requirements. Set the threshold to 10 seconds or more to avoid latency fluctuations caused by network or database loads.</p>
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
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the Alibaba Cloud China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The Alibaba Cloud International site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks by using CloudMonitor</a>.</li>
     * </ul>
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
     * <li>You must specify at least one of the <strong>ErrorAlertStatus</strong> and <strong>DelayAlertStatus</strong> parameters.</li>
     * <li>After the abnormal status monitoring feature is enabled, an alert is triggered if an exception is detected.</li>
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
     * <p>The region ID of the change tracking instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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

    /**
     * <p>The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsl8zl9ek6292****</p>
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

    public ConfigureSubscriptionInstanceAlertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureSubscriptionInstanceAlertRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
