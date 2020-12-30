// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetSimilarPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSimilarPhotosResponseBody body;

    public static GetSimilarPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarPhotosResponse self = new GetSimilarPhotosResponse();
        return TeaModel.build(map, self);
    }

    public GetSimilarPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimilarPhotosResponse setBody(GetSimilarPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimilarPhotosResponseBody getBody() {
        return this.body;
    }

}
