// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProhibitedSoftwareResponseBody body;

    public static DeleteProhibitedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedSoftwareResponse self = new DeleteProhibitedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProhibitedSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProhibitedSoftwareResponse setBody(DeleteProhibitedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProhibitedSoftwareResponseBody getBody() {
        return this.body;
    }

}
