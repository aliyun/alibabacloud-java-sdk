// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebCCRulesV2ResponseBody body;

    public static DescribeWebCCRulesV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesV2Response self = new DescribeWebCCRulesV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCCRulesV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebCCRulesV2Response setBody(DescribeWebCCRulesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCCRulesV2ResponseBody getBody() {
        return this.body;
    }

}
