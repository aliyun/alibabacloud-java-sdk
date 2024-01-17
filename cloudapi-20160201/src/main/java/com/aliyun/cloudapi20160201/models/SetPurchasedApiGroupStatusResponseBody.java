// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetPurchasedApiGroupStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPurchasedApiGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPurchasedApiGroupStatusResponseBody self = new SetPurchasedApiGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPurchasedApiGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
