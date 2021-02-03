// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmRecoveryPlansResponseBody body;

    public static DescribeGtmRecoveryPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlansResponse self = new DescribeGtmRecoveryPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmRecoveryPlansResponse setBody(DescribeGtmRecoveryPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmRecoveryPlansResponseBody getBody() {
        return this.body;
    }

}
