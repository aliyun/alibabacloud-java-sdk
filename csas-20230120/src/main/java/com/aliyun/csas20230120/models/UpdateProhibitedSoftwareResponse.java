// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProhibitedSoftwareResponseBody body;

    public static UpdateProhibitedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedSoftwareResponse self = new UpdateProhibitedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProhibitedSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProhibitedSoftwareResponse setBody(UpdateProhibitedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProhibitedSoftwareResponseBody getBody() {
        return this.body;
    }

}
