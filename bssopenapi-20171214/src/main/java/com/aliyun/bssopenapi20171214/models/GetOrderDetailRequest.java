// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetOrderDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static GetOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailRequest self = new GetOrderDetailRequest();
        return TeaModel.build(map, self);
    }

}
