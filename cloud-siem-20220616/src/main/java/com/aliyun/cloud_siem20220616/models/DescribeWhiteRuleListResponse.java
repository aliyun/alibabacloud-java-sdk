// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWhiteRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteRuleListResponseBody body;

    public static DescribeWhiteRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteRuleListResponse self = new DescribeWhiteRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteRuleListResponse setBody(DescribeWhiteRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteRuleListResponseBody getBody() {
        return this.body;
    }

}
