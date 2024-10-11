// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class StopDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDataSetResponseBody body;

    public static StopDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataSetResponse self = new StopDataSetResponse();
        return TeaModel.build(map, self);
    }

    public StopDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDataSetResponse setBody(StopDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataSetResponseBody getBody() {
        return this.body;
    }

}
