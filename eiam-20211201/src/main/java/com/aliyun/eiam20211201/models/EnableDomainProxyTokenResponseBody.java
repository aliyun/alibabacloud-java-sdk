// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableDomainProxyTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDomainProxyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDomainProxyTokenResponseBody self = new EnableDomainProxyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDomainProxyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
