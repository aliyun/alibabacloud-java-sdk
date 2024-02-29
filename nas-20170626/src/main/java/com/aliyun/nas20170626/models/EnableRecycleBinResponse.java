// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableRecycleBinResponseBody body;

    public static EnableRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRecycleBinResponse self = new EnableRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public EnableRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRecycleBinResponse setBody(EnableRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRecycleBinResponseBody getBody() {
        return this.body;
    }

}
