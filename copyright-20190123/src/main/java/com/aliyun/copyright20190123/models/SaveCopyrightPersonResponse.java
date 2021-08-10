// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveCopyrightPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveCopyrightPersonResponseBody body;

    public static SaveCopyrightPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCopyrightPersonResponse self = new SaveCopyrightPersonResponse();
        return TeaModel.build(map, self);
    }

    public SaveCopyrightPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCopyrightPersonResponse setBody(SaveCopyrightPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCopyrightPersonResponseBody getBody() {
        return this.body;
    }

}
