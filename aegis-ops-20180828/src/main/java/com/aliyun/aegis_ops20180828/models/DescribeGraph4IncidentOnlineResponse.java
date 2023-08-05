// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4IncidentOnlineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGraph4IncidentOnlineResponseBody body;

    public static DescribeGraph4IncidentOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4IncidentOnlineResponse self = new DescribeGraph4IncidentOnlineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4IncidentOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGraph4IncidentOnlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGraph4IncidentOnlineResponse setBody(DescribeGraph4IncidentOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGraph4IncidentOnlineResponseBody getBody() {
        return this.body;
    }

}
