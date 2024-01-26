// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ActivateOfficeSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateOfficeSiteResponseBody body;

    public static ActivateOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateOfficeSiteResponse self = new ActivateOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public ActivateOfficeSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateOfficeSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateOfficeSiteResponse setBody(ActivateOfficeSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateOfficeSiteResponseBody getBody() {
        return this.body;
    }

}
