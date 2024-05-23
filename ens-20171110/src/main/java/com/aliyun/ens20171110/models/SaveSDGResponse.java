// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SaveSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSDGResponseBody body;

    public static SaveSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSDGResponse self = new SaveSDGResponse();
        return TeaModel.build(map, self);
    }

    public SaveSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSDGResponse setBody(SaveSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSDGResponseBody getBody() {
        return this.body;
    }

}
