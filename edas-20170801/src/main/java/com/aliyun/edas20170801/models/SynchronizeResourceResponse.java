// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SynchronizeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynchronizeResourceResponseBody body;

    public static SynchronizeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeResourceResponse self = new SynchronizeResourceResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeResourceResponse setBody(SynchronizeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeResourceResponseBody getBody() {
        return this.body;
    }

}
