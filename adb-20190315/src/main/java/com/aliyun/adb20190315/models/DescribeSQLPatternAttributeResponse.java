// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLPatternAttributeResponseBody body;

    public static DescribeSQLPatternAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternAttributeResponse self = new DescribeSQLPatternAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLPatternAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLPatternAttributeResponse setBody(DescribeSQLPatternAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPatternAttributeResponseBody getBody() {
        return this.body;
    }

}
