// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetImageTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageTestResultResponseBody body;

    public static GetImageTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageTestResultResponse self = new GetImageTestResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageTestResultResponse setBody(GetImageTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageTestResultResponseBody getBody() {
        return this.body;
    }

}
