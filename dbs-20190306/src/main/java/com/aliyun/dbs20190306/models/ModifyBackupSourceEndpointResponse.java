// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSourceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBackupSourceEndpointResponseBody body;

    public static ModifyBackupSourceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSourceEndpointResponse self = new ModifyBackupSourceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSourceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupSourceEndpointResponse setBody(ModifyBackupSourceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupSourceEndpointResponseBody getBody() {
        return this.body;
    }

}
