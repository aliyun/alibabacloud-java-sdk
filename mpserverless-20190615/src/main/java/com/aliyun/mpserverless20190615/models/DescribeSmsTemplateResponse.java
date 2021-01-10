// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsTemplateResponseBody body;

    public static DescribeSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsTemplateResponse self = new DescribeSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsTemplateResponse setBody(DescribeSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
