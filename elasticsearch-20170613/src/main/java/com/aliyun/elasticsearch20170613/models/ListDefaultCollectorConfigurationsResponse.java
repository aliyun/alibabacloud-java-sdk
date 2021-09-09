// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDefaultCollectorConfigurationsResponseBody body;

    public static ListDefaultCollectorConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsResponse self = new ListDefaultCollectorConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDefaultCollectorConfigurationsResponse setBody(ListDefaultCollectorConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDefaultCollectorConfigurationsResponseBody getBody() {
        return this.body;
    }

}
