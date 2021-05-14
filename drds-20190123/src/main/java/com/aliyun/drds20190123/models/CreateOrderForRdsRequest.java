// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateOrderForRdsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Params")
    public String params;

    public static CreateOrderForRdsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForRdsRequest self = new CreateOrderForRdsRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderForRdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrderForRdsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
