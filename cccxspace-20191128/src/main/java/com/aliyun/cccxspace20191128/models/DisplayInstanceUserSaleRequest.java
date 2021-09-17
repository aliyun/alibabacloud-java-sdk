// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DisplayInstanceUserSaleRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static DisplayInstanceUserSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisplayInstanceUserSaleRequest self = new DisplayInstanceUserSaleRequest();
        return TeaModel.build(map, self);
    }

    public DisplayInstanceUserSaleRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
