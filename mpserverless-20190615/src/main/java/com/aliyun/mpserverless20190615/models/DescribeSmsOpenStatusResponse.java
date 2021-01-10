// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsOpenStatusResponseBody body;

    public static DescribeSmsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsOpenStatusResponse self = new DescribeSmsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsOpenStatusResponse setBody(DescribeSmsOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsOpenStatusResponseBody getBody() {
        return this.body;
    }

}
