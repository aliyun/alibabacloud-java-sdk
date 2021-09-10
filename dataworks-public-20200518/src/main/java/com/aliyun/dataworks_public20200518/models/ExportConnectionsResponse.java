// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportConnectionsResponseBody body;

    public static ExportConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportConnectionsResponse self = new ExportConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ExportConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportConnectionsResponse setBody(ExportConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportConnectionsResponseBody getBody() {
        return this.body;
    }

}
