// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDomainsResponseBody body;

    public static ListDataDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDomainsResponse self = new ListDataDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDomainsResponse setBody(ListDataDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDomainsResponseBody getBody() {
        return this.body;
    }

}
