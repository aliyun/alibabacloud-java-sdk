// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopPageResult extends TeaModel {
    /**
     * <p>API request ID</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Shop collection</p>
     */
    @NameInMap("shopList")
    public java.util.List<ShopPageDataResult> shopList;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ShopPageResult build(java.util.Map<String, ?> map) throws Exception {
        ShopPageResult self = new ShopPageResult();
        return TeaModel.build(map, self);
    }

    public ShopPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShopPageResult setShopList(java.util.List<ShopPageDataResult> shopList) {
        this.shopList = shopList;
        return this;
    }
    public java.util.List<ShopPageDataResult> getShopList() {
        return this.shopList;
    }

    public ShopPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
