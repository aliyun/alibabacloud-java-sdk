// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAclEntriesResponseBody body;

    public static ListAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclEntriesResponse self = new ListAclEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAclEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAclEntriesResponse setBody(ListAclEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclEntriesResponseBody getBody() {
        return this.body;
    }

}
