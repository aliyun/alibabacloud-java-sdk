// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDataAPIServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAPIServiceDetailResponseBody body;

    public static GetDataAPIServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAPIServiceDetailResponse self = new GetDataAPIServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAPIServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAPIServiceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAPIServiceDetailResponse setBody(GetDataAPIServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAPIServiceDetailResponseBody getBody() {
        return this.body;
    }

}
