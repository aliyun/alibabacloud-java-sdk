// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckEngineMetaTableResponseBody body;

    public static CheckEngineMetaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaTableResponse self = new CheckEngineMetaTableResponse();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckEngineMetaTableResponse setBody(CheckEngineMetaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckEngineMetaTableResponseBody getBody() {
        return this.body;
    }

}
