// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CooperationShop extends TeaModel {
    @NameInMap("CooperationCompanyId")
    public String cooperationCompanyId;

    @NameInMap("CooperationShopId")
    public String cooperationShopId;

    @NameInMap("shopId")
    public String shopId;

    public static CooperationShop build(java.util.Map<String, ?> map) throws Exception {
        CooperationShop self = new CooperationShop();
        return TeaModel.build(map, self);
    }

    public CooperationShop setCooperationCompanyId(String cooperationCompanyId) {
        this.cooperationCompanyId = cooperationCompanyId;
        return this;
    }
    public String getCooperationCompanyId() {
        return this.cooperationCompanyId;
    }

    public CooperationShop setCooperationShopId(String cooperationShopId) {
        this.cooperationShopId = cooperationShopId;
        return this;
    }
    public String getCooperationShopId() {
        return this.cooperationShopId;
    }

    public CooperationShop setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
