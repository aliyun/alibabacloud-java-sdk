// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSubscriptionInstanceRequest extends TeaModel {
    @NameInMap("SourceEndpoint")
    public CreateSubscriptionInstanceRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method of the change tracking instance.</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the PayType parameter to **Prepaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the change tracking instance. The region ID is the same as that of the source instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The subscription length.</p>
     * <br>
     * <p>*   If the billing cycle is **Year**, the value range is **1 to 5**.</p>
     * <p>*   If the billing cycle is **Month**, the value range is **1 to 60**.</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the PayType parameter to **Prepaid**.</p>
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
         * <p>The type of the source instance. Valid values: **MySQL**, **PolarDB**, **DRDS**, and **Oracle**.</p>
         * <br>
         * <p>>  Default value: **MySQL**.</p>
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
