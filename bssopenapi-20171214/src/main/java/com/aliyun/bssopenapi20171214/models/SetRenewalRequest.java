// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    @NameInMap("InstanceIDs")
    @Validation(required = true)
    public String instanceIDs;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    @NameInMap("RenewalStatus")
    @Validation(required = true)
    public String renewalStatus;

    public static SetRenewalRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRenewalRequest self = new SetRenewalRequest();
        return TeaModel.build(map, self);
    }

    public SetRenewalRequest setRenewalPeriod(Integer renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
        return this;
    }
    public Integer getRenewalPeriod() {
        return this.renewalPeriod;
    }

    public SetRenewalRequest setInstanceIDs(String instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }
    public String getInstanceIDs() {
        return this.instanceIDs;
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

    public SetRenewalRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
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

}
