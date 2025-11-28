// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBaaSAntChainBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBaaSAntChainBizChainResponseBody body;

    public static AddBaaSAntChainBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBaaSAntChainBizChainResponse self = new AddBaaSAntChainBizChainResponse();
        return TeaModel.build(map, self);
    }

    public AddBaaSAntChainBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBaaSAntChainBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBaaSAntChainBizChainResponse setBody(AddBaaSAntChainBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBaaSAntChainBizChainResponseBody getBody() {
        return this.body;
    }

}
