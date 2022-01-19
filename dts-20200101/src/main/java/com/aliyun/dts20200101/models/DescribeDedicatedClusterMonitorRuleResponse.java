// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterMonitorRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDedicatedClusterMonitorRuleResponse setBody(DescribeDedicatedClusterMonitorRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedClusterMonitorRuleResponseBody getBody() {
        return this.body;
    }

}
