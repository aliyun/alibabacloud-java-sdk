// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class SuspendCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static SuspendCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendCommodityInstanceRequest self = new SuspendCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SuspendCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
