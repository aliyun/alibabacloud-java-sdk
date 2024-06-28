// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can enable auto-renewal for up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).</p>
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
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal period. Valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * <li>12</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    /**
     * <p>The unit of the auto-renewal period. Valid values:</p>
     * <ul>
     * <li>M: months</li>
     * <li>Y: years</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>M</p>
     */
    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    /**
     * <p>The status of renewal. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: The instance is automatically renewed.</li>
     * <li>ManualRenewal: The instance is manually renewed.</li>
     * <li>NotRenewal: The instance is not renewed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription</li>
     * <li>PayAsYouGo: pay-as-you-go</li>
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
