// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgDNSMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgDNSMapResponseBody body;

    public static ListOrgDNSMapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgDNSMapResponse self = new ListOrgDNSMapResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgDNSMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgDNSMapResponse setBody(ListOrgDNSMapResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgDNSMapResponseBody getBody() {
        return this.body;
    }

}
