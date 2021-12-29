// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBaaSFabricBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBaaSFabricBizChainResponseBody body;

    public static AddBaaSFabricBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBaaSFabricBizChainResponse self = new AddBaaSFabricBizChainResponse();
        return TeaModel.build(map, self);
    }

    public AddBaaSFabricBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBaaSFabricBizChainResponse setBody(AddBaaSFabricBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBaaSFabricBizChainResponseBody getBody() {
        return this.body;
    }

}
