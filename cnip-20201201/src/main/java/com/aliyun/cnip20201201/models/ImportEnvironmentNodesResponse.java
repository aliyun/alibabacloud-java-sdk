// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ImportEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportEnvironmentNodesResponseBody body;

    public static ImportEnvironmentNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportEnvironmentNodesResponse self = new ImportEnvironmentNodesResponse();
        return TeaModel.build(map, self);
    }

    public ImportEnvironmentNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportEnvironmentNodesResponse setBody(ImportEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
