// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordDataResponseBody body;

    public static GetRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordDataResponse self = new GetRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordDataResponse setBody(GetRecordDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordDataResponseBody getBody() {
        return this.body;
    }

}
