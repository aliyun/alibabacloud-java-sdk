// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundWebSiteInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefundWebSiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundWebSiteInstanceResponseBody self = new RefundWebSiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundWebSiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
