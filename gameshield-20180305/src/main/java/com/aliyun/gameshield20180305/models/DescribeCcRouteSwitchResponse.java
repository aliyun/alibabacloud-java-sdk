// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcRouteSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcRouteSwitchResponseBody body;

    public static DescribeCcRouteSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcRouteSwitchResponse self = new DescribeCcRouteSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcRouteSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcRouteSwitchResponse setBody(DescribeCcRouteSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcRouteSwitchResponseBody getBody() {
        return this.body;
    }

}
