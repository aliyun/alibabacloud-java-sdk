// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class JoinPublicIpsToEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinPublicIpsToEpnInstanceResponseBody body;

    public static JoinPublicIpsToEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinPublicIpsToEpnInstanceResponse self = new JoinPublicIpsToEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public JoinPublicIpsToEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinPublicIpsToEpnInstanceResponse setBody(JoinPublicIpsToEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinPublicIpsToEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
