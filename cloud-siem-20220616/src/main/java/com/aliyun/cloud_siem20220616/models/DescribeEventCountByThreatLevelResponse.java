// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventCountByThreatLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventCountByThreatLevelResponseBody body;

    public static DescribeEventCountByThreatLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventCountByThreatLevelResponse self = new DescribeEventCountByThreatLevelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventCountByThreatLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventCountByThreatLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventCountByThreatLevelResponse setBody(DescribeEventCountByThreatLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventCountByThreatLevelResponseBody getBody() {
        return this.body;
    }

}
