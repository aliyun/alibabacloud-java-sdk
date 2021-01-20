// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExporterRuleListResponseBody body;

    public static DescribeExporterRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterRuleListResponse self = new DescribeExporterRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExporterRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExporterRuleListResponse setBody(DescribeExporterRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExporterRuleListResponseBody getBody() {
        return this.body;
    }

}
