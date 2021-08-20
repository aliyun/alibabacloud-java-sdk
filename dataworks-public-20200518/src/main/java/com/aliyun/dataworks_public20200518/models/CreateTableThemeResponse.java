// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableThemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTableThemeResponseBody body;

    public static CreateTableThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableThemeResponse self = new CreateTableThemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTableThemeResponse setBody(CreateTableThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTableThemeResponseBody getBody() {
        return this.body;
    }

}
