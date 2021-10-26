// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PriceUnit")
    public String priceUnit;

    @NameInMap("SkuCode")
    public String skuCode;

    public static DescribeImagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePriceRequest self = new DescribeImagePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePriceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribeImagePriceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImagePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeImagePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeImagePriceRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public DescribeImagePriceRequest setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }
    public String getSkuCode() {
        return this.skuCode;
    }

}
