// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeToutiaoLivePublishResponseBody body;

    public static DescribeToutiaoLivePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeToutiaoLivePublishResponse self = new DescribeToutiaoLivePublishResponse();
        return TeaModel.build(map, self);
    }

    public DescribeToutiaoLivePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeToutiaoLivePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeToutiaoLivePublishResponse setBody(DescribeToutiaoLivePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeToutiaoLivePublishResponseBody getBody() {
        return this.body;
    }

}
