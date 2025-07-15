// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveRecordNotifyRecordsResponseBody body;

    public static DescribeLiveRecordNotifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyRecordsResponse self = new DescribeLiveRecordNotifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRecordNotifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveRecordNotifyRecordsResponse setBody(DescribeLiveRecordNotifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRecordNotifyRecordsResponseBody getBody() {
        return this.body;
    }

}
