// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCoverageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteCoverageResponseBody body;

    public static UpdateSiteCoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCoverageResponse self = new UpdateSiteCoverageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteCoverageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteCoverageResponse setBody(UpdateSiteCoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteCoverageResponseBody getBody() {
        return this.body;
    }

}
