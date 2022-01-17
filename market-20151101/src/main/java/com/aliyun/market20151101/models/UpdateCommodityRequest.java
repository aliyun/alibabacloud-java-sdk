// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class UpdateCommodityRequest extends TeaModel {
    @NameInMap("CommodityId")
    public String commodityId;

    @NameInMap("Content")
    public String content;

    public static UpdateCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommodityRequest self = new UpdateCommodityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommodityRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public UpdateCommodityRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
