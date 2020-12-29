// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosThresholdResponseBody body;

    public static DescribeDdosThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdResponse self = new DescribeDdosThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosThresholdResponse setBody(DescribeDdosThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosThresholdResponseBody getBody() {
        return this.body;
    }

}
