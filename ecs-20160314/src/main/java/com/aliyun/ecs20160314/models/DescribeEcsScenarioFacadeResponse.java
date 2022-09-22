// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeEcsScenarioFacadeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEcsScenarioFacadeResponseBody body;

    public static DescribeEcsScenarioFacadeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcsScenarioFacadeResponse self = new DescribeEcsScenarioFacadeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEcsScenarioFacadeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEcsScenarioFacadeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEcsScenarioFacadeResponse setBody(DescribeEcsScenarioFacadeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEcsScenarioFacadeResponseBody getBody() {
        return this.body;
    }

}
