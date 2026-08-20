// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProhibitedSoftwareResponseBody body;

    public static GetProhibitedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedSoftwareResponse self = new GetProhibitedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public GetProhibitedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProhibitedSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProhibitedSoftwareResponse setBody(GetProhibitedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProhibitedSoftwareResponseBody getBody() {
        return this.body;
    }

}
