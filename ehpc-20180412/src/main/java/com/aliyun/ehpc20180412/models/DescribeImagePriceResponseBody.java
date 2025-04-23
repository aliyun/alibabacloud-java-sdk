// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceResponseBody extends TeaModel {
    /**
     * <p>The number of instances that are purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The discount.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiscountPrice")
    public Float discountPrice;

    /**
     * <p>The ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp198jigq7l1ga11****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The original price of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>47ca3ac4-2a03-48f1-8bf2-ba6de0f3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The final price of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
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
