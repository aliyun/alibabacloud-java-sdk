// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateNetworkRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkRulesResponseBody body;

    public static CreateNetworkRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRulesResponse self = new CreateNetworkRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkRulesResponse setBody(CreateNetworkRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkRulesResponseBody getBody() {
        return this.body;
    }

}
