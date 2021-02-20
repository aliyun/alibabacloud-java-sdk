// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserDNSMapHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserDNSMapHistoriesResponseBody body;

    public static ListUserDNSMapHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDNSMapHistoriesResponse self = new ListUserDNSMapHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDNSMapHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDNSMapHistoriesResponse setBody(ListUserDNSMapHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDNSMapHistoriesResponseBody getBody() {
        return this.body;
    }

}
