// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StopAdHocTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAdHocTaskResponseBody body;

    public static StopAdHocTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAdHocTaskResponse self = new StopAdHocTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopAdHocTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAdHocTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAdHocTaskResponse setBody(StopAdHocTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAdHocTaskResponseBody getBody() {
        return this.body;
    }

}
