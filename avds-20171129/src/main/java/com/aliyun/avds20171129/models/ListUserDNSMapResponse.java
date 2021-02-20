// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserDNSMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserDNSMapResponseBody body;

    public static ListUserDNSMapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDNSMapResponse self = new ListUserDNSMapResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDNSMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDNSMapResponse setBody(ListUserDNSMapResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDNSMapResponseBody getBody() {
        return this.body;
    }

}
