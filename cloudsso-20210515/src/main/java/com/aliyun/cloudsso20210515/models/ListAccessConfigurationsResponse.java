// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessConfigurationsResponseBody body;

    public static ListAccessConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationsResponse self = new ListAccessConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessConfigurationsResponse setBody(ListAccessConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessConfigurationsResponseBody getBody() {
        return this.body;
    }

}
