// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableThemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTableThemeResponseBody body;

    public static DeleteTableThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableThemeResponse self = new DeleteTableThemeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableThemeResponse setBody(DeleteTableThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableThemeResponseBody getBody() {
        return this.body;
    }

}
