// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaInfoJobResponseBody body;

    public static GetMediaInfoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoJobResponse self = new GetMediaInfoJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaInfoJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaInfoJobResponse setBody(GetMediaInfoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaInfoJobResponseBody getBody() {
        return this.body;
    }

}
