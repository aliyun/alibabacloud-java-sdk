// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class GetProductInfoByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductInfoByIdsResponseBody body;

    public static GetProductInfoByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductInfoByIdsResponse self = new GetProductInfoByIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetProductInfoByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductInfoByIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductInfoByIdsResponse setBody(GetProductInfoByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductInfoByIdsResponseBody getBody() {
        return this.body;
    }

}
