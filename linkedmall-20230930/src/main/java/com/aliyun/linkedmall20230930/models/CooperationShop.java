// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CooperationShop extends TeaModel {
    /**
     * <p>The partner enterprise ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11200003</p>
     */
    @NameInMap("cooperationCompanyId")
    public String cooperationCompanyId;

    /**
     * <p>The partner store ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21000026</p>
     */
    @NameInMap("cooperationShopId")
    public String cooperationShopId;

    /**
     * <p>The store ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22000019</p>
     */
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
