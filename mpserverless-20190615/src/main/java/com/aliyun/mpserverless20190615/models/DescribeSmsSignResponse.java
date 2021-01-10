// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsSignResponseBody body;

    public static DescribeSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignResponse self = new DescribeSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsSignResponse setBody(DescribeSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsSignResponseBody getBody() {
        return this.body;
    }

}
