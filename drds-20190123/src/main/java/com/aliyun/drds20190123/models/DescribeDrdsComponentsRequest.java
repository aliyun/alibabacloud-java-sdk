// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsComponentsRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    public static DescribeDrdsComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsComponentsRequest self = new DescribeDrdsComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsComponentsRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
