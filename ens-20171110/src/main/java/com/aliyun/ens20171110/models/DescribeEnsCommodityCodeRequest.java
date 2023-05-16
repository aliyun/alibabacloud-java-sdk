// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityCodeRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    public static DescribeEnsCommodityCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityCodeRequest self = new DescribeEnsCommodityCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityCodeRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
