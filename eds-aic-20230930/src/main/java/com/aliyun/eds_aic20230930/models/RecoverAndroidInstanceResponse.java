// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoverAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverAndroidInstanceResponseBody body;

    public static RecoverAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverAndroidInstanceResponse self = new RecoverAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RecoverAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverAndroidInstanceResponse setBody(RecoverAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
