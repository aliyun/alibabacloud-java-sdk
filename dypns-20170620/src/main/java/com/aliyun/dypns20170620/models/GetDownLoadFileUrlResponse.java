// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetDownLoadFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDownLoadFileUrlResponseBody body;

    public static GetDownLoadFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownLoadFileUrlResponse self = new GetDownLoadFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDownLoadFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownLoadFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownLoadFileUrlResponse setBody(GetDownLoadFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownLoadFileUrlResponseBody getBody() {
        return this.body;
    }

}
