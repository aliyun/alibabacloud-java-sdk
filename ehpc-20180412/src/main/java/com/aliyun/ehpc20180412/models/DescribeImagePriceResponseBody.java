// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceResponseBody extends TeaModel {
    /**
     * <p>The number of instances that are purchased.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The discount.</p>
     */
    @NameInMap("DiscountPrice")
    public Float discountPrice;

    /**
     * <p>The ID of the custom image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The original price of the image.</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The final price of the image.</p>
     */
    @NameInMap("TradePrice")
    public Float tradePrice;

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

    public DescribeImagePriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public DescribeImagePriceResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImagePriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribeImagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

}
