// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static ReleaseCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCommodityInstanceRequest self = new ReleaseCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
