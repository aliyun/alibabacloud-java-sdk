// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcIDCBlockSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcIDCBlockSwitchResponseBody body;

    public static DescribeCcIDCBlockSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcIDCBlockSwitchResponse self = new DescribeCcIDCBlockSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcIDCBlockSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcIDCBlockSwitchResponse setBody(DescribeCcIDCBlockSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcIDCBlockSwitchResponseBody getBody() {
        return this.body;
    }

}
