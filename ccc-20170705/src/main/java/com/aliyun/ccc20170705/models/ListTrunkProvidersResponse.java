// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTrunkProvidersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrunkProvidersResponseBody body;

    public static ListTrunkProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrunkProvidersResponse self = new ListTrunkProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListTrunkProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrunkProvidersResponse setBody(ListTrunkProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrunkProvidersResponseBody getBody() {
        return this.body;
    }

}
