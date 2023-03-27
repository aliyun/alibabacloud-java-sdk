// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateMenuDataShrinkRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("Country")
    public String country;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ProductCombineList")
    public String productCombineListShrink;

    @NameInMap("ProductContainerId")
    public String productContainerId;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    @NameInMap("Type")
    public String type;

    public static CreateMenuDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMenuDataShrinkRequest self = new CreateMenuDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMenuDataShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CreateMenuDataShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateMenuDataShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateMenuDataShrinkRequest setProductCombineListShrink(String productCombineListShrink) {
        this.productCombineListShrink = productCombineListShrink;
        return this;
    }
    public String getProductCombineListShrink() {
        return this.productCombineListShrink;
    }

    public CreateMenuDataShrinkRequest setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

    public CreateMenuDataShrinkRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public CreateMenuDataShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

    public CreateMenuDataShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
