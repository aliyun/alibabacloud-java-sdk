// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSubscriptionInstanceRequest extends TeaModel {
    @NameInMap("SourceEndpoint")
    public CreateSubscriptionInstanceRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a value from your client to make sure that the value is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method.</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go. This is the default value.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing method of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: annual subscription.</li>
     * <li><strong>Month</strong>: monthly subscription.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when PayType is set to <strong>Prepaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID. Set this parameter to the region where the subscription object resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region to which the change tracking instance belongs. You do not need to specify this parameter. This parameter will be discontinued.</p>
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
     * <p>The purchase duration of the subscription instance.</p>
     * <ul>
     * <li>If the billing method is set to <strong>Year</strong> (annual subscription), the valid values are <strong>1 to 5</strong>.</li>
     * <li>If the billing method is set to <strong>Month</strong> (monthly subscription), the valid values are <strong>1 to 60</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when PayType is set to <strong>Prepaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static CreateSubscriptionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionInstanceRequest self = new CreateSubscriptionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionInstanceRequest setSourceEndpoint(CreateSubscriptionInstanceRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public CreateSubscriptionInstanceRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public CreateSubscriptionInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateSubscriptionInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubscriptionInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateSubscriptionInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateSubscriptionInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSubscriptionInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSubscriptionInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSubscriptionInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSubscriptionInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static class CreateSubscriptionInstanceRequestSourceEndpoint extends TeaModel {
        /**
         * <p>数据订阅的实例类型，取值为：<strong>MySQL</strong>、<strong>PolarDB</strong>、<strong>DRDS</strong>、<strong>Oracle</strong>。</p>
         * <blockquote>
         * <p>默认取值为：<strong>MySQL</strong>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateSubscriptionInstanceRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionInstanceRequestSourceEndpoint self = new CreateSubscriptionInstanceRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionInstanceRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
