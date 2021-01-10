// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttRootTopicsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqttRootTopicsResponseBody body;

    public static ListMqttRootTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqttRootTopicsResponse self = new ListMqttRootTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqttRootTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqttRootTopicsResponse setBody(ListMqttRootTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqttRootTopicsResponseBody getBody() {
        return this.body;
    }

}
