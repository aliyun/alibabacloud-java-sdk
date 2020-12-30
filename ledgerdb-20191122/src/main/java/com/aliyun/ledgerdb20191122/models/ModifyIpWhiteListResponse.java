// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIpWhiteListResponseBody body;

    public static ModifyIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhiteListResponse self = new ModifyIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIpWhiteListResponse setBody(ModifyIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
