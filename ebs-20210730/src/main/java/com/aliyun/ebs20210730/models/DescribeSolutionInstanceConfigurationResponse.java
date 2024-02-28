// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeSolutionInstanceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSolutionInstanceConfigurationResponseBody body;

    public static DescribeSolutionInstanceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSolutionInstanceConfigurationResponse self = new DescribeSolutionInstanceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSolutionInstanceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSolutionInstanceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSolutionInstanceConfigurationResponse setBody(DescribeSolutionInstanceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSolutionInstanceConfigurationResponseBody getBody() {
        return this.body;
    }

}
