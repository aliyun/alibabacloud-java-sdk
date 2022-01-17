// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DeleteCommodityRequest extends TeaModel {
    @NameInMap("CommodityId")
    public String commodityId;

    public static DeleteCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommodityRequest self = new DeleteCommodityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommodityRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

}
