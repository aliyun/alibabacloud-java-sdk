// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlTemplateAttributeResponseBody body;

    public static DescribeSqlTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateAttributeResponse self = new DescribeSqlTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlTemplateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlTemplateAttributeResponse setBody(DescribeSqlTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
