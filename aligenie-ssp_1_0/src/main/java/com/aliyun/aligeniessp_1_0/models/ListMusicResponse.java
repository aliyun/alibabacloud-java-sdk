// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListMusicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMusicResponseBody body;

    public static ListMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMusicResponse self = new ListMusicResponse();
        return TeaModel.build(map, self);
    }

    public ListMusicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMusicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMusicResponse setBody(ListMusicResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMusicResponseBody getBody() {
        return this.body;
    }

}
