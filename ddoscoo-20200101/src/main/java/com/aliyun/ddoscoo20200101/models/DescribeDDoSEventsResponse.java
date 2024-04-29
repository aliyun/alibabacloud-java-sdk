// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDDoSEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSEventsResponse setBody(DescribeDDoSEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSEventsResponseBody getBody() {
        return this.body;
    }

}
