// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetYikeStoryboardJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeStoryboardJobResponseBody body;

    public static GetYikeStoryboardJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeStoryboardJobResponse self = new GetYikeStoryboardJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeStoryboardJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeStoryboardJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeStoryboardJobResponse setBody(GetYikeStoryboardJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeStoryboardJobResponseBody getBody() {
        return this.body;
    }

}
