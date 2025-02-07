// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteNameExclusiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteNameExclusiveResponseBody body;

    public static UpdateSiteNameExclusiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteNameExclusiveResponse self = new UpdateSiteNameExclusiveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteNameExclusiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteNameExclusiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteNameExclusiveResponse setBody(UpdateSiteNameExclusiveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteNameExclusiveResponseBody getBody() {
        return this.body;
    }

}
