// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GetBsnByResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBsnByResourceResponseBody body;

    public static GetBsnByResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBsnByResourceResponse self = new GetBsnByResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetBsnByResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBsnByResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBsnByResourceResponse setBody(GetBsnByResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBsnByResourceResponseBody getBody() {
        return this.body;
    }

}
