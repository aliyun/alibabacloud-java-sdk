// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBaaSFabricBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddBaaSFabricBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBaaSFabricBizChainResponse setBody(AddBaaSFabricBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBaaSFabricBizChainResponseBody getBody() {
        return this.body;
    }

}
