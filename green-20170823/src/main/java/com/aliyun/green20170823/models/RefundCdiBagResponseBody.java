// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefundCdiBagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBagResponseBody self = new RefundCdiBagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundCdiBagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
