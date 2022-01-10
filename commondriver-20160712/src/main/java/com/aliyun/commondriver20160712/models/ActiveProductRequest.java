// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class ActiveProductRequest extends TeaModel {
    @NameInMap("ActiveCode")
    public String activeCode;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("ItemCode")
    public String itemCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ActiveProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveProductRequest self = new ActiveProductRequest();
        return TeaModel.build(map, self);
    }

    public ActiveProductRequest setActiveCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }
    public String getActiveCode() {
        return this.activeCode;
    }

    public ActiveProductRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ActiveProductRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ActiveProductRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ActiveProductRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public ActiveProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
