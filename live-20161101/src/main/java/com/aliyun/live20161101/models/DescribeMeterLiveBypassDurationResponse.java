// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveBypassDurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterLiveBypassDurationResponseBody body;

    public static DescribeMeterLiveBypassDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveBypassDurationResponse self = new DescribeMeterLiveBypassDurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveBypassDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterLiveBypassDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterLiveBypassDurationResponse setBody(DescribeMeterLiveBypassDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterLiveBypassDurationResponseBody getBody() {
        return this.body;
    }

}
