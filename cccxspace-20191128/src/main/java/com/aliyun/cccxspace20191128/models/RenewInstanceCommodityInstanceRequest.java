// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewInstanceCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static RenewInstanceCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceCommodityInstanceRequest self = new RenewInstanceCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
