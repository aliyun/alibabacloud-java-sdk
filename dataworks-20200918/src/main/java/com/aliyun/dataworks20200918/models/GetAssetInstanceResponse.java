// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetAssetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetInstanceResponseBody body;

    public static GetAssetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetInstanceResponse self = new GetAssetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetInstanceResponse setBody(GetAssetInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetInstanceResponseBody getBody() {
        return this.body;
    }

}
