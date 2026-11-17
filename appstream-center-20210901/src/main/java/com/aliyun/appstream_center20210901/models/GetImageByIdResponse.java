// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageByIdResponseBody body;

    public static GetImageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageByIdResponse self = new GetImageByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetImageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageByIdResponse setBody(GetImageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageByIdResponseBody getBody() {
        return this.body;
    }

}
