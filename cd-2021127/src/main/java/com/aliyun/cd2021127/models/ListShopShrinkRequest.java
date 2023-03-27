// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShopGroupIds")
    public String shopGroupIdsShrink;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("ShopName")
    public String shopName;

    public static ListShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShopShrinkRequest self = new ListShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListShopShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ListShopShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShopShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShopShrinkRequest setShopGroupIdsShrink(String shopGroupIdsShrink) {
        this.shopGroupIdsShrink = shopGroupIdsShrink;
        return this;
    }
    public String getShopGroupIdsShrink() {
        return this.shopGroupIdsShrink;
    }

    public ListShopShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListShopShrinkRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

}
