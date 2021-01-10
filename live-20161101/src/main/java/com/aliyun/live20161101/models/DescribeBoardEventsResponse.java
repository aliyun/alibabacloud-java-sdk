// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBoardEventsResponseBody body;

    public static DescribeBoardEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardEventsResponse self = new DescribeBoardEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBoardEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBoardEventsResponse setBody(DescribeBoardEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBoardEventsResponseBody getBody() {
        return this.body;
    }

}
