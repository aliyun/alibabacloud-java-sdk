// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoverAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverAppResponseBody body;

    public static RecoverAppResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverAppResponse self = new RecoverAppResponse();
        return TeaModel.build(map, self);
    }

    public RecoverAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverAppResponse setBody(RecoverAppResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverAppResponseBody getBody() {
        return this.body;
    }

}
