// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobRunDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDIJobRunDetailsResponseBody body;

    public static ListDIJobRunDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobRunDetailsResponse self = new ListDIJobRunDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListDIJobRunDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDIJobRunDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDIJobRunDetailsResponse setBody(ListDIJobRunDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDIJobRunDetailsResponseBody getBody() {
        return this.body;
    }

}
