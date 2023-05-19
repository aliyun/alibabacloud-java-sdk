// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can enable auto-renewal for up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal period. Valid values:</p>
     * <br>
     * <p>*   1</p>
     * <p>*   2</p>
     * <p>*   3</p>
     * <p>*   6</p>
     * <p>*   12</p>
     * <br>
     * <p>>  This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
     */
    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    /**
     * <p>The unit of the auto-renewal period. Valid values:</p>
     * <br>
     * <p>*   M: months</p>
     * <p>*   Y: years</p>
     * <br>
     * <p>>  This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
     */
    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    /**
     * <p>The status of renewal. Valid values:</p>
     * <br>
     * <p>*   AutoRenewal: The instance is automatically renewed.</p>
     * <p>*   ManualRenewal: The instance is manually renewed.</p>
     * <p>*   NotRenewal: The instance is not renewed.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: subscription</p>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static SetRenewalRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRenewalRequest self = new SetRenewalRequest();
        return TeaModel.build(map, self);
    }

    public SetRenewalRequest setInstanceIDs(String instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }
    public String getInstanceIDs() {
        return this.instanceIDs;
    }

    public SetRenewalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetRenewalRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SetRenewalRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public SetRenewalRequest setRenewalPeriod(Integer renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
        return this;
    }
    public Integer getRenewalPeriod() {
        return this.renewalPeriod;
    }

    public SetRenewalRequest setRenewalPeriodUnit(String renewalPeriodUnit) {
        this.renewalPeriodUnit = renewalPeriodUnit;
        return this;
    }
    public String getRenewalPeriodUnit() {
        return this.renewalPeriodUnit;
    }

    public SetRenewalRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public SetRenewalRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
