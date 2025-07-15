// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageGroupBandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveMessageGroupBandResponseBody body;

    public static DescribeLiveMessageGroupBandResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageGroupBandResponse self = new DescribeLiveMessageGroupBandResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageGroupBandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveMessageGroupBandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveMessageGroupBandResponse setBody(DescribeLiveMessageGroupBandResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveMessageGroupBandResponseBody getBody() {
        return this.body;
    }

}
