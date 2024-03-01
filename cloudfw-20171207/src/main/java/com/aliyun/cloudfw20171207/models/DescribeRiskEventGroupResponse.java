// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventGroupResponseBody body;

    public static DescribeRiskEventGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventGroupResponse self = new DescribeRiskEventGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventGroupResponse setBody(DescribeRiskEventGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventGroupResponseBody getBody() {
        return this.body;
    }

}
