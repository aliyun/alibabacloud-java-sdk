// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ResumeCommodityInstanceRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static ResumeCommodityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeCommodityInstanceRequest self = new ResumeCommodityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeCommodityInstanceRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
