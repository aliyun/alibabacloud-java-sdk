// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCategoryChainResponseBody body;

    public static GetCategoryChainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryChainResponse self = new GetCategoryChainResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoryChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoryChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCategoryChainResponse setBody(GetCategoryChainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoryChainResponseBody getBody() {
        return this.body;
    }

}
