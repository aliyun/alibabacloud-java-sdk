// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchLibrariesResponseBody body;

    public static FetchLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchLibrariesResponse self = new FetchLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public FetchLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchLibrariesResponse setBody(FetchLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchLibrariesResponseBody getBody() {
        return this.body;
    }

}
