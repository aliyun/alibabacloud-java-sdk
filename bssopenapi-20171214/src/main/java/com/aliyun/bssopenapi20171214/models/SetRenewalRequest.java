// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

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
