// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchMomentPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchMomentPhotosResponseBody body;

    public static FetchMomentPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchMomentPhotosResponse self = new FetchMomentPhotosResponse();
        return TeaModel.build(map, self);
    }

    public FetchMomentPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchMomentPhotosResponse setBody(FetchMomentPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchMomentPhotosResponseBody getBody() {
        return this.body;
    }

}
