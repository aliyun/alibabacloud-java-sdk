// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronousJobConfigurationResponseBody body;

    public static DescribeSynchronousJobConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobConfigurationResponse self = new DescribeSynchronousJobConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronousJobConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronousJobConfigurationResponse setBody(DescribeSynchronousJobConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronousJobConfigurationResponseBody getBody() {
        return this.body;
    }

}
