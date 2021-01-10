// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingCustomDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListWebHostingCustomDomainsResponse setBody(ListWebHostingCustomDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebHostingCustomDomainsResponseBody getBody() {
        return this.body;
    }

}
