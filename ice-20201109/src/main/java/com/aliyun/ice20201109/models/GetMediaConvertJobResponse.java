// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConvertJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConvertJobResponseBody body;

    public static GetMediaConvertJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConvertJobResponse self = new GetMediaConvertJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConvertJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConvertJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConvertJobResponse setBody(GetMediaConvertJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConvertJobResponseBody getBody() {
        return this.body;
    }

}
