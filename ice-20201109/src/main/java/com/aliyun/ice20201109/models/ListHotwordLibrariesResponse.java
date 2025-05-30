// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListHotwordLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotwordLibrariesResponseBody body;

    public static ListHotwordLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotwordLibrariesResponse self = new ListHotwordLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public ListHotwordLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotwordLibrariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotwordLibrariesResponse setBody(ListHotwordLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotwordLibrariesResponseBody getBody() {
        return this.body;
    }

}
