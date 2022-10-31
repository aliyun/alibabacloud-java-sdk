// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMeterLiveRtcDurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterLiveRtcDurationResponseBody body;

    public static DescribeMeterLiveRtcDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterLiveRtcDurationResponse self = new DescribeMeterLiveRtcDurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterLiveRtcDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterLiveRtcDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterLiveRtcDurationResponse setBody(DescribeMeterLiveRtcDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterLiveRtcDurationResponseBody getBody() {
        return this.body;
    }

}
