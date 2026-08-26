// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServerIdeInstanceResponseBody body;

    public static UpdateServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerIdeInstanceResponse self = new UpdateServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServerIdeInstanceResponse setBody(UpdateServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
