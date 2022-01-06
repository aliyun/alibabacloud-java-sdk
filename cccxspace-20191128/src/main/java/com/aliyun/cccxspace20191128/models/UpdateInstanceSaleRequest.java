// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceSaleRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static UpdateInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSaleRequest self = new UpdateInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSaleRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

    public UpdateInstanceSaleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateInstanceSaleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
