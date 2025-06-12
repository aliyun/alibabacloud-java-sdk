// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2StreamEngineInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2StreamEngineInfoResponseBody body;

    public static GetLindormV2StreamEngineInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2StreamEngineInfoResponse self = new GetLindormV2StreamEngineInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2StreamEngineInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2StreamEngineInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2StreamEngineInfoResponse setBody(GetLindormV2StreamEngineInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2StreamEngineInfoResponseBody getBody() {
        return this.body;
    }

}
