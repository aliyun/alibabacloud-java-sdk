// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetShowListBackgroundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetShowListBackgroundResponseBody body;

    public static SetShowListBackgroundResponse build(java.util.Map<String, ?> map) throws Exception {
        SetShowListBackgroundResponse self = new SetShowListBackgroundResponse();
        return TeaModel.build(map, self);
    }

    public SetShowListBackgroundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetShowListBackgroundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetShowListBackgroundResponse setBody(SetShowListBackgroundResponseBody body) {
        this.body = body;
        return this;
    }
    public SetShowListBackgroundResponseBody getBody() {
        return this.body;
    }

}
