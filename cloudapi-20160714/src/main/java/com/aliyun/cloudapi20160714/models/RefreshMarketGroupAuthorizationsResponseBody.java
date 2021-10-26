// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RefreshMarketGroupAuthorizationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshMarketGroupAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshMarketGroupAuthorizationsResponseBody self = new RefreshMarketGroupAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshMarketGroupAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
