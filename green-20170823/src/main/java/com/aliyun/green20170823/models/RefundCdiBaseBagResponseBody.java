// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBaseBagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefundCdiBaseBagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBaseBagResponseBody self = new RefundCdiBaseBagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundCdiBaseBagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
