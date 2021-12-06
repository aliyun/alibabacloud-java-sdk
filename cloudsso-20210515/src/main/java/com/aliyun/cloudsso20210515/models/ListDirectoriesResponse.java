// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDirectoriesResponseBody body;

    public static ListDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesResponse self = new ListDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDirectoriesResponse setBody(ListDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectoriesResponseBody getBody() {
        return this.body;
    }

}
