// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RenameResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameResourceResponseBody body;

    public static RenameResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameResourceResponse self = new RenameResourceResponse();
        return TeaModel.build(map, self);
    }

    public RenameResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameResourceResponse setBody(RenameResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameResourceResponseBody getBody() {
        return this.body;
    }

}
