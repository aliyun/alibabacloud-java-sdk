// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByOuterBusinessIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordsByOuterBusinessIdResponseBody body;

    public static GetRecordsByOuterBusinessIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByOuterBusinessIdResponse self = new GetRecordsByOuterBusinessIdResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordsByOuterBusinessIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordsByOuterBusinessIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordsByOuterBusinessIdResponse setBody(GetRecordsByOuterBusinessIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordsByOuterBusinessIdResponseBody getBody() {
        return this.body;
    }

}
