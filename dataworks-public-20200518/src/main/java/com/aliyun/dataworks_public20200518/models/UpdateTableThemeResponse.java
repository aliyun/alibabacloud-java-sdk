// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableThemeResponseBody body;

    public static UpdateTableThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableThemeResponse self = new UpdateTableThemeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableThemeResponse setBody(UpdateTableThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableThemeResponseBody getBody() {
        return this.body;
    }

}
