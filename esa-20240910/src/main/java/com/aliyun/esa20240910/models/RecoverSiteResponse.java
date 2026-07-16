// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RecoverSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverSiteResponseBody body;

    public static RecoverSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverSiteResponse self = new RecoverSiteResponse();
        return TeaModel.build(map, self);
    }

    public RecoverSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverSiteResponse setBody(RecoverSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverSiteResponseBody getBody() {
        return this.body;
    }

}
