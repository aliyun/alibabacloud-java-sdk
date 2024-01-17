// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourcePriceRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("AppInstanceType")
    public String appInstanceType;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    @NameInMap("Period")
    public Long period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ProductType")
    public String productType;

    public static GetResourcePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePriceRequest self = new GetResourcePriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcePriceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public GetResourcePriceRequest setAppInstanceType(String appInstanceType) {
        this.appInstanceType = appInstanceType;
        return this;
    }
    public String getAppInstanceType() {
        return this.appInstanceType;
    }

    public GetResourcePriceRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetResourcePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetResourcePriceRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public GetResourcePriceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public GetResourcePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public GetResourcePriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
