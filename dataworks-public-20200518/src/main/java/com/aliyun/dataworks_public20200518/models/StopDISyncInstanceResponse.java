// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDISyncInstanceResponseBody body;

    public static StopDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponse self = new StopDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDISyncInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDISyncInstanceResponse setBody(StopDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}
