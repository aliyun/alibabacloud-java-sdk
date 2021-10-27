// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPriceRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRdsPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPriceRequest self = new DescribeRdsPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPriceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeRdsPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
