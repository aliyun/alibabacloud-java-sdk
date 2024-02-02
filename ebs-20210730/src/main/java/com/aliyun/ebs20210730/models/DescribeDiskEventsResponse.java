// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskEventsResponseBody body;

    public static DescribeDiskEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEventsResponse self = new DescribeDiskEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskEventsResponse setBody(DescribeDiskEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskEventsResponseBody getBody() {
        return this.body;
    }

}
