// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AlterSearchIndexResponseBody body;

    public static AlterSearchIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchIndexResponse self = new AlterSearchIndexResponse();
        return TeaModel.build(map, self);
    }

    public AlterSearchIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterSearchIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlterSearchIndexResponse setBody(AlterSearchIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterSearchIndexResponseBody getBody() {
        return this.body;
    }

}
