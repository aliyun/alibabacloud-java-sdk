// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordsResponseBody body;

    public static GetRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsResponse self = new GetRecordsResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordsResponse setBody(GetRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordsResponseBody getBody() {
        return this.body;
    }

}
