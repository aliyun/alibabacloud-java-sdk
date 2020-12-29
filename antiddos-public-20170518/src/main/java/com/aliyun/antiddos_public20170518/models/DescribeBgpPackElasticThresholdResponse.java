// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackElasticThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBgpPackElasticThresholdResponseBody body;

    public static DescribeBgpPackElasticThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackElasticThresholdResponse self = new DescribeBgpPackElasticThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackElasticThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpPackElasticThresholdResponse setBody(DescribeBgpPackElasticThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpPackElasticThresholdResponseBody getBody() {
        return this.body;
    }

}
