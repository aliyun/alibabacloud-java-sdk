// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMetaTableTaskResponseBody body;

    public static CheckMetaTableTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableTaskResponse self = new CheckMetaTableTaskResponse();
        return TeaModel.build(map, self);
    }

    public CheckMetaTableTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMetaTableTaskResponse setBody(CheckMetaTableTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMetaTableTaskResponseBody getBody() {
        return this.body;
    }

}
