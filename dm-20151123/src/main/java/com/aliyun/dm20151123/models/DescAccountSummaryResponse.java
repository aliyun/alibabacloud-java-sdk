// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescAccountSummaryResponseBody body;

    public static DescAccountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescAccountSummaryResponse self = new DescAccountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescAccountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescAccountSummaryResponse setBody(DescAccountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescAccountSummaryResponseBody getBody() {
        return this.body;
    }

}
