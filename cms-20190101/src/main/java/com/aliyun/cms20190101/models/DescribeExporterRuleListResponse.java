// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeExporterRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExporterRuleListResponse setBody(DescribeExporterRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExporterRuleListResponseBody getBody() {
        return this.body;
    }

}
