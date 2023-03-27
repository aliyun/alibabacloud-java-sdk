// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShopGroupIds")
    public java.util.List<String> shopGroupIds;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("ShopName")
    public String shopName;

    public static ListShopRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShopRequest self = new ListShopRequest();
        return TeaModel.build(map, self);
    }

    public ListShopRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ListShopRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShopRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShopRequest setShopGroupIds(java.util.List<String> shopGroupIds) {
        this.shopGroupIds = shopGroupIds;
        return this;
    }
    public java.util.List<String> getShopGroupIds() {
        return this.shopGroupIds;
    }

    public ListShopRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListShopRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

}
