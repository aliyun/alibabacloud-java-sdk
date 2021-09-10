// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMetaTableResponseBody body;

    public static CheckMetaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableResponse self = new CheckMetaTableResponse();
        return TeaModel.build(map, self);
    }

    public CheckMetaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMetaTableResponse setBody(CheckMetaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMetaTableResponseBody getBody() {
        return this.body;
    }

}
