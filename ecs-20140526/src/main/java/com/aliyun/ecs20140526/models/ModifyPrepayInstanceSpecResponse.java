// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ModifyPrepayInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponse self = new ModifyPrepayInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

}
