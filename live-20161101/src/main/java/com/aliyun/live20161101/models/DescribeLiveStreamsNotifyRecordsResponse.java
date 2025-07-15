// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamsNotifyRecordsResponseBody body;

    public static DescribeLiveStreamsNotifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyRecordsResponse self = new DescribeLiveStreamsNotifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsNotifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamsNotifyRecordsResponse setBody(DescribeLiveStreamsNotifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsNotifyRecordsResponseBody getBody() {
        return this.body;
    }

}
