// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveRecordNotifyConfigResponseBody body;

    public static DescribeLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyConfigResponse self = new DescribeLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRecordNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveRecordNotifyConfigResponse setBody(DescribeLiveRecordNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRecordNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
