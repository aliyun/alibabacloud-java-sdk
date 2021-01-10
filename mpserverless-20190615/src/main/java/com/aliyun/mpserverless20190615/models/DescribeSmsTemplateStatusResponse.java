// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsTemplateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsTemplateStatusResponseBody body;

    public static DescribeSmsTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsTemplateStatusResponse self = new DescribeSmsTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsTemplateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsTemplateStatusResponse setBody(DescribeSmsTemplateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsTemplateStatusResponseBody getBody() {
        return this.body;
    }

}
