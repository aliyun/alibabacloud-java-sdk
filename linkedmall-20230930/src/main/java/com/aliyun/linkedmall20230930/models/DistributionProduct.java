// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributionProduct extends TeaModel {
    /**
     * <p>The category chain name.</p>
     */
    @NameInMap("categoryChain")
    public String categoryChain;

    /**
     * <p>The leaf category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50016422</p>
     */
    @NameInMap("categoryLeafId")
    public Long categoryLeafId;

    /**
     * <p>The leaf category name.</p>
     * 
     * <strong>example:</strong>
     * <p>示例类目</p>
     */
    @NameInMap("categoryLeafName")
    public String categoryLeafName;

    /**
     * <p>The channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LM_DEMO</p>
     */
    @NameInMap("channelCode")
    public String channelCode;

    /**
     * <p>The distribution status.</p>
     */
    @NameInMap("distributeStatus")
    public String distributeStatus;

    /**
     * <p>The main image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/images/product.png">https://example.com/images/product.png</a></p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>660057403063402509</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The seller ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("sellerId")
    public String sellerId;

    /**
     * <p>The short product title.</p>
     * 
     * <strong>example:</strong>
     * <p>示例商品</p>
     */
    @NameInMap("shortTitle")
    public String shortTitle;

    /**
     * <p>The SKU list.</p>
     */
    @NameInMap("skus")
    public java.util.List<DistributionSku> skus;

    /**
     * <p>The long product title.</p>
     * 
     * <strong>example:</strong>
     * <p>示例商品名称</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The white background image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/images/product-white.png">https://example.com/images/product-white.png</a></p>
     */
    @NameInMap("whiteBackgroundPicUrl")
    public String whiteBackgroundPicUrl;

    public static DistributionProduct build(java.util.Map<String, ?> map) throws Exception {
        DistributionProduct self = new DistributionProduct();
        return TeaModel.build(map, self);
    }

    public DistributionProduct setCategoryChain(String categoryChain) {
        this.categoryChain = categoryChain;
        return this;
    }
    public String getCategoryChain() {
        return this.categoryChain;
    }

    public DistributionProduct setCategoryLeafId(Long categoryLeafId) {
        this.categoryLeafId = categoryLeafId;
        return this;
    }
    public Long getCategoryLeafId() {
        return this.categoryLeafId;
    }

    public DistributionProduct setCategoryLeafName(String categoryLeafName) {
        this.categoryLeafName = categoryLeafName;
        return this;
    }
    public String getCategoryLeafName() {
        return this.categoryLeafName;
    }

    public DistributionProduct setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public DistributionProduct setDistributeStatus(String distributeStatus) {
        this.distributeStatus = distributeStatus;
        return this;
    }
    public String getDistributeStatus() {
        return this.distributeStatus;
    }

    public DistributionProduct setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public DistributionProduct setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DistributionProduct setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public DistributionProduct setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
        return this;
    }
    public String getShortTitle() {
        return this.shortTitle;
    }

    public DistributionProduct setSkus(java.util.List<DistributionSku> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<DistributionSku> getSkus() {
        return this.skus;
    }

    public DistributionProduct setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DistributionProduct setWhiteBackgroundPicUrl(String whiteBackgroundPicUrl) {
        this.whiteBackgroundPicUrl = whiteBackgroundPicUrl;
        return this;
    }
    public String getWhiteBackgroundPicUrl() {
        return this.whiteBackgroundPicUrl;
    }

}
