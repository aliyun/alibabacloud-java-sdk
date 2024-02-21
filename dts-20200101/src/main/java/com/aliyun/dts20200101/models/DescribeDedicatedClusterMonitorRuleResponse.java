// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDedicatedClusterMonitorRuleResponseBody body;

    public static DescribeDedicatedClusterMonitorRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterMonitorRuleResponse self = new DescribeDedicatedClusterMonitorRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterMonitorRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedClusterMonitorRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedClusterMonitorRuleResponse setBody(DescribeDedicatedClusterMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedClusterMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
