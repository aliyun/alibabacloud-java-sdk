// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamsNotifyUrlConfigResponseBody body;

    public static DescribeLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigResponse self = new DescribeLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setBody(DescribeLiveStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
