// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    /**
     * <p>The instance IDs. You can specify up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-askjdhaskfjh</p>
     */
    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal period of the instance. Valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * <li>12</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when RenewalStatus is set to AutoRenewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    /**
     * <p>The unit of the auto-renewal cycle. Valid values:</p>
     * <ul>
     * <li>M: month.</li>
     * <li>Y: year.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when RenewalStatus is set to AutoRenewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>M</p>
     */
    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    /**
     * <p>The renewal status. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: auto-renewal.</li>
     * <li>ManualRenewal: manual renewal.</li>
     * <li>NotRenewal: no renewal.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
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
