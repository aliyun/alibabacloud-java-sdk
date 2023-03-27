// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopGroupName")
    public String shopGroupName;

    public static ListShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShopGroupRequest self = new ListShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListShopGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ListShopGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShopGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShopGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public ListShopGroupRequest setShopGroupName(String shopGroupName) {
        this.shopGroupName = shopGroupName;
        return this;
    }
    public String getShopGroupName() {
        return this.shopGroupName;
    }

}
