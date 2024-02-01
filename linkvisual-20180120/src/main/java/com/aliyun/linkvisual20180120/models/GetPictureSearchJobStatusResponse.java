// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureSearchJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPictureSearchJobStatusResponseBody body;

    public static GetPictureSearchJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchJobStatusResponse self = new GetPictureSearchJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPictureSearchJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPictureSearchJobStatusResponse setBody(GetPictureSearchJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPictureSearchJobStatusResponseBody getBody() {
        return this.body;
    }

}
