// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListUserResourcesRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    public static ListUserResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserResourcesRequest self = new ListUserResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserResourcesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
