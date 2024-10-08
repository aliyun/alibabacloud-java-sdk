// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSiteResponseBody body;

    public static DeleteSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteResponse self = new DeleteSiteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSiteResponse setBody(DeleteSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteResponseBody getBody() {
        return this.body;
    }

}
