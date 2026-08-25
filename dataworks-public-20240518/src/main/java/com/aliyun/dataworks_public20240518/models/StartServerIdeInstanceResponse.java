// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartServerIdeInstanceResponseBody body;

    public static StartServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartServerIdeInstanceResponse self = new StartServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartServerIdeInstanceResponse setBody(StartServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
