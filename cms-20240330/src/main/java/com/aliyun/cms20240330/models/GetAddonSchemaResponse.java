// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAddonSchemaResponseBody body;

    public static GetAddonSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddonSchemaResponse self = new GetAddonSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetAddonSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddonSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAddonSchemaResponse setBody(GetAddonSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddonSchemaResponseBody getBody() {
        return this.body;
    }

}
