// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCustomLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteCustomLogResponseBody body;

    public static UpdateSiteCustomLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCustomLogResponse self = new UpdateSiteCustomLogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCustomLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteCustomLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteCustomLogResponse setBody(UpdateSiteCustomLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteCustomLogResponseBody getBody() {
        return this.body;
    }

}
