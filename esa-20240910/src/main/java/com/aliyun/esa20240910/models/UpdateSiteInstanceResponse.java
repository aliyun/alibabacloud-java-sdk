// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteInstanceResponseBody body;

    public static UpdateSiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteInstanceResponse self = new UpdateSiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteInstanceResponse setBody(UpdateSiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteInstanceResponseBody getBody() {
        return this.body;
    }

}
