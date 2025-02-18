// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributionProduct extends TeaModel {
    @NameInMap("categoryChain")
    public String categoryChain;

    @NameInMap("categoryLeafId")
    public Long categoryLeafId;

    @NameInMap("categoryLeafName")
    public String categoryLeafName;

    @NameInMap("channelCode")
    public String channelCode;

    @NameInMap("distributeStatus")
    public String distributeStatus;

    @NameInMap("picUrl")
    public String picUrl;

    @NameInMap("productId")
    public String productId;

    @NameInMap("sellerId")
    public String sellerId;

    @NameInMap("shortTitle")
    public String shortTitle;

    @NameInMap("skus")
    public java.util.List<DistributionSku> skus;

    @NameInMap("title")
    public String title;

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
