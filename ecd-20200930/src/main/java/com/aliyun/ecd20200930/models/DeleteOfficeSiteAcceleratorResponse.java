// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSiteAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOfficeSiteAcceleratorResponseBody body;

    public static DeleteOfficeSiteAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSiteAcceleratorResponse self = new DeleteOfficeSiteAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSiteAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOfficeSiteAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOfficeSiteAcceleratorResponse setBody(DeleteOfficeSiteAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOfficeSiteAcceleratorResponseBody getBody() {
        return this.body;
    }

}
