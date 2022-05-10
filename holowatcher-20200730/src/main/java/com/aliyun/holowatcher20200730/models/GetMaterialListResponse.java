// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetMaterialListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMaterialListResponseBody body;

    public static GetMaterialListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialListResponse self = new GetMaterialListResponse();
        return TeaModel.build(map, self);
    }

    public GetMaterialListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaterialListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaterialListResponse setBody(GetMaterialListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaterialListResponseBody getBody() {
        return this.body;
    }

}
