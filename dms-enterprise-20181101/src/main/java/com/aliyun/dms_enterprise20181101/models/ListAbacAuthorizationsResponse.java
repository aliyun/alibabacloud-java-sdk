// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAbacAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAbacAuthorizationsResponseBody body;

    public static ListAbacAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAbacAuthorizationsResponse self = new ListAbacAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAbacAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAbacAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAbacAuthorizationsResponse setBody(ListAbacAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAbacAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
