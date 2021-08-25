// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancePriceRequest extends TeaModel {
    @NameInMap("paramStr")
    public String paramStr;

    public static DescribeReservedInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancePriceRequest self = new DescribeReservedInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancePriceRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
