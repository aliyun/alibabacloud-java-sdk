// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAclRelationsResponseBody body;

    public static ListAclRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclRelationsResponse self = new ListAclRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAclRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAclRelationsResponse setBody(ListAclRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclRelationsResponseBody getBody() {
        return this.body;
    }

}
