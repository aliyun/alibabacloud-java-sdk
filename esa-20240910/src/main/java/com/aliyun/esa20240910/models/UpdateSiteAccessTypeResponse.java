// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteAccessTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteAccessTypeResponseBody body;

    public static UpdateSiteAccessTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteAccessTypeResponse self = new UpdateSiteAccessTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteAccessTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteAccessTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteAccessTypeResponse setBody(UpdateSiteAccessTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteAccessTypeResponseBody getBody() {
        return this.body;
    }

}
