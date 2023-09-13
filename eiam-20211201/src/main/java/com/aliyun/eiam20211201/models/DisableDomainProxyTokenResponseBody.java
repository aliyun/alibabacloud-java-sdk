// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableDomainProxyTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDomainProxyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDomainProxyTokenResponseBody self = new DisableDomainProxyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDomainProxyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
