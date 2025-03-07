// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaLiveInputResponseBody body;

    public static GetMediaLiveInputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveInputResponse self = new GetMediaLiveInputResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaLiveInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaLiveInputResponse setBody(GetMediaLiveInputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaLiveInputResponseBody getBody() {
        return this.body;
    }

}
