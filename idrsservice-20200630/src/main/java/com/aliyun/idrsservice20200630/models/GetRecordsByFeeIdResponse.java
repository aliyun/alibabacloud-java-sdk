// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByFeeIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordsByFeeIdResponseBody body;

    public static GetRecordsByFeeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByFeeIdResponse self = new GetRecordsByFeeIdResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordsByFeeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordsByFeeIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordsByFeeIdResponse setBody(GetRecordsByFeeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordsByFeeIdResponseBody getBody() {
        return this.body;
    }

}
