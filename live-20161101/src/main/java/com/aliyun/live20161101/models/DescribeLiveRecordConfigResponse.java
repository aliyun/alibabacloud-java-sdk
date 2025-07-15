// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveRecordConfigResponseBody body;

    public static DescribeLiveRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordConfigResponse self = new DescribeLiveRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRecordConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveRecordConfigResponse setBody(DescribeLiveRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRecordConfigResponseBody getBody() {
        return this.body;
    }

}
