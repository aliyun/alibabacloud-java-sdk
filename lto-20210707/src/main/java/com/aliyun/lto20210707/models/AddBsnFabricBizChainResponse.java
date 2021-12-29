// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBsnFabricBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBsnFabricBizChainResponseBody body;

    public static AddBsnFabricBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBsnFabricBizChainResponse self = new AddBsnFabricBizChainResponse();
        return TeaModel.build(map, self);
    }

    public AddBsnFabricBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBsnFabricBizChainResponse setBody(AddBsnFabricBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBsnFabricBizChainResponseBody getBody() {
        return this.body;
    }

}
