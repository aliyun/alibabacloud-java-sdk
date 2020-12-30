// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SearchPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchPhotosResponseBody body;

    public static SearchPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPhotosResponse self = new SearchPhotosResponse();
        return TeaModel.build(map, self);
    }

    public SearchPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPhotosResponse setBody(SearchPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPhotosResponseBody getBody() {
        return this.body;
    }

}
