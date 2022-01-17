// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCommodityRequest extends TeaModel {
    @NameInMap("CommodityId")
    public String commodityId;

    public static DescribeCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityRequest self = new DescribeCommodityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

}
