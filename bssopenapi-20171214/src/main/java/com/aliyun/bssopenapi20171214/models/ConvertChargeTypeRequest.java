// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Unit: months. This parameter is required if you switch the billing method to subscription. Valid values:</p>
     * <br>
     * <p>*   1 to 9</p>
     * <p>*   12</p>
     * <p>*   24</p>
     * <p>*   36</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The code of the service to which the instance belongs.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service to which the instance belongs.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   Subscription: subscription</p>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     * <br>
     * <p>>  After the call is successful, the billing method of the instance is switched.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static ConvertChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeRequest self = new ConvertChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ConvertChargeTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConvertChargeTypeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ConvertChargeTypeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ConvertChargeTypeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ConvertChargeTypeRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
