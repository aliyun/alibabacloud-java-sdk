// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIDEEventDetailResponseBody body;

    public static GetIDEEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIDEEventDetailResponse self = new GetIDEEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetIDEEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIDEEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIDEEventDetailResponse setBody(GetIDEEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIDEEventDetailResponseBody getBody() {
        return this.body;
    }

}
