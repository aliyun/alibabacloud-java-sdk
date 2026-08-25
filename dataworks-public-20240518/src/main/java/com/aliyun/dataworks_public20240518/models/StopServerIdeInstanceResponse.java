// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopServerIdeInstanceResponseBody body;

    public static StopServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopServerIdeInstanceResponse self = new StopServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopServerIdeInstanceResponse setBody(StopServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
