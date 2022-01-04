// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateMenuDataShrinkRequest extends TeaModel {
    // 菜单商品容器数据批次id-选填
    @NameInMap("BatchId")
    public String batchId;

    // 数据优先级，数值越高，优先级越大（默认为0）-选填
    @NameInMap("Priority")
    public Integer priority;

    // 菜单商品容器数据-必填
    @NameInMap("ProductCombineList")
    public String productCombineListShrink;

    // 菜单商品容器数据id-必填
    @NameInMap("ProductContainerId")
    public String productContainerId;

    // 自定义门店组id（当shopIdList为空才生效）-选填
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    // 自定义门店id列表（shopIdList不为空，shopGroupId无效，shopId=-1表示门店默认数据）-选填
    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    // 菜单商品容器数据类型（目前支持：top,morning,afternoon）-必填
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
