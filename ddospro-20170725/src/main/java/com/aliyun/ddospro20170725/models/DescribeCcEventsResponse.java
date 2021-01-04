// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeCcEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcEventsResponseBody body;

    public static DescribeCcEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcEventsResponse self = new DescribeCcEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcEventsResponse setBody(DescribeCcEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcEventsResponseBody getBody() {
        return this.body;
    }

}
