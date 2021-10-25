// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceResponseBody extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("TradePrice")
    public Float tradePrice;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("ImageId")
    public String imageId;

    public static DescribeImagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePriceResponseBody self = new DescribeImagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePriceResponseBody setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribeImagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public DescribeImagePriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public DescribeImagePriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribeImagePriceResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
