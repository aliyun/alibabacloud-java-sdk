// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDoSEventsResponseBody body;

    public static DescribeDDoSEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventsResponse self = new DescribeDDoSEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSEventsResponse setBody(DescribeDDoSEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSEventsResponseBody getBody() {
        return this.body;
    }

}
