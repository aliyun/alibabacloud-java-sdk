// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProhibitedSoftwareResponseBody body;

    public static ListProhibitedSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedSoftwareResponse self = new ListProhibitedSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public ListProhibitedSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProhibitedSoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProhibitedSoftwareResponse setBody(ListProhibitedSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProhibitedSoftwareResponseBody getBody() {
        return this.body;
    }

}
