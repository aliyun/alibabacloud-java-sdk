// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOutboundStrategiesResponseBody body;

    public static ListOutboundStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesResponse self = new ListOutboundStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundStrategiesResponse setBody(ListOutboundStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundStrategiesResponseBody getBody() {
        return this.body;
    }

}
