// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlTemplateGroupAttributeResponseBody body;

    public static DescribeSqlTemplateGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateGroupAttributeResponse self = new DescribeSqlTemplateGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlTemplateGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlTemplateGroupAttributeResponse setBody(DescribeSqlTemplateGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlTemplateGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
