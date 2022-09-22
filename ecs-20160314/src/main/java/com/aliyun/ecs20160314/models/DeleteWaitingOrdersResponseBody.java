// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteWaitingOrdersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWaitingOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingOrdersResponseBody self = new DeleteWaitingOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
