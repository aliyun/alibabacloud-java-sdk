// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportConnectionsResponseBody body;

    public static ImportConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportConnectionsResponse self = new ImportConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ImportConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportConnectionsResponse setBody(ImportConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportConnectionsResponseBody getBody() {
        return this.body;
    }

}
