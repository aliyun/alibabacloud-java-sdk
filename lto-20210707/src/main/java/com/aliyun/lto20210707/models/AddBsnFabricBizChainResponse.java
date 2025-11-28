// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBsnFabricBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddBsnFabricBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBsnFabricBizChainResponse setBody(AddBsnFabricBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBsnFabricBizChainResponseBody getBody() {
        return this.body;
    }

}
