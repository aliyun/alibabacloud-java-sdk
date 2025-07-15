// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePlayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeToutiaoLivePlayResponseBody body;

    public static DescribeToutiaoLivePlayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeToutiaoLivePlayResponse self = new DescribeToutiaoLivePlayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeToutiaoLivePlayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeToutiaoLivePlayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeToutiaoLivePlayResponse setBody(DescribeToutiaoLivePlayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeToutiaoLivePlayResponseBody getBody() {
        return this.body;
    }

}
