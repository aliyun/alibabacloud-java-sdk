// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRecordResultResponseBody body;

    public static GetRecordResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordResultResponse self = new GetRecordResultResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordResultResponse setBody(GetRecordResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordResultResponseBody getBody() {
        return this.body;
    }

}
