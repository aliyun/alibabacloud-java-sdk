// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class ListAllServiceProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllServiceProviderResponseBody body;

    public static ListAllServiceProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllServiceProviderResponse self = new ListAllServiceProviderResponse();
        return TeaModel.build(map, self);
    }

    public ListAllServiceProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllServiceProviderResponse setBody(ListAllServiceProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllServiceProviderResponseBody getBody() {
        return this.body;
    }

}
