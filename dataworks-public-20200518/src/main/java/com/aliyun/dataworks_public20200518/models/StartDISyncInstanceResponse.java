// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDISyncInstanceResponseBody body;

    public static StartDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponse self = new StartDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDISyncInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDISyncInstanceResponse setBody(StartDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}
