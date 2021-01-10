// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttMessageLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqttMessageLogsResponseBody body;

    public static ListMqttMessageLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqttMessageLogsResponse self = new ListMqttMessageLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqttMessageLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqttMessageLogsResponse setBody(ListMqttMessageLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqttMessageLogsResponseBody getBody() {
        return this.body;
    }

}
