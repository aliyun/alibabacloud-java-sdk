// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImagePriceRequest extends TeaModel {
    /**
     * <p>The number of images that you want to purchase. Valid values: 1 to 1000.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The ID of an image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp198jigq7l1ga11****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the order. The order can be set only as a purchase order. Valid value: INSTANCE-BUY.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE-BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The subscription duration of the read-only instance. Valid values:</p>
     * <ul>
     * <li>If PriceUnit is set to Day, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, and 30.</li>
     * <li>If PriceUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>If PriceUnit is set to Year, the valid values of the Period parameter are 1, 2, and 3.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li>Day</li>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <p>Default value: Day.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("PriceUnit")
    public String priceUnit;

    /**
     * <p>The stock keeping unit (SKU) of the image. Valid value: package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>package</p>
     */
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
