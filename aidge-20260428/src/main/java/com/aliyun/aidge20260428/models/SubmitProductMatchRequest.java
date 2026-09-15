// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SubmitProductMatchRequest extends TeaModel {
    /**
     * <p>The product brand. If this value is not specified, the system attempts to extract the brand from the shop name.</p>
     * 
     * <strong>example:</strong>
     * <p>FILA</p>
     */
    @NameInMap("BrandName")
    public String brandName;

    /**
     * <p>The Miaojie product category. Currently used for extension and auditing purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>Children\&quot;s Shoes</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The HTTP or HTTPS URL of the product main image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/items/228516909/main.jpg">https://example.com/items/228516909/main.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The Miaojie product ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>228516909</p>
     */
    @NameInMap("ItemId")
    public String itemId;

    /**
     * <p>The HTTP or HTTPS URL of the product detail page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/items/228516909">https://example.com/items/228516909</a></p>
     */
    @NameInMap("ProductUrl")
    public String productUrl;

    /**
     * <p>The shop name. This value is also used as the extraction source when the brand name is missing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FILA斐乐官方旗舰店</p>
     */
    @NameInMap("ShopName")
    public String shopName;

    /**
     * <p>The product title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FILA Kids Training Shoes</p>
     */
    @NameInMap("Title")
    public String title;

    public static SubmitProductMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitProductMatchRequest self = new SubmitProductMatchRequest();
        return TeaModel.build(map, self);
    }

    public SubmitProductMatchRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public SubmitProductMatchRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SubmitProductMatchRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SubmitProductMatchRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public SubmitProductMatchRequest setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public SubmitProductMatchRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public SubmitProductMatchRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
