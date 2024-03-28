// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingCustomDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebHostingCustomDomainsResponseBody body;

    public static ListWebHostingCustomDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingCustomDomainsResponse self = new ListWebHostingCustomDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListWebHostingCustomDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebHostingCustomDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebHostingCustomDomainsResponse setBody(ListWebHostingCustomDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebHostingCustomDomainsResponseBody getBody() {
        return this.body;
    }

}
