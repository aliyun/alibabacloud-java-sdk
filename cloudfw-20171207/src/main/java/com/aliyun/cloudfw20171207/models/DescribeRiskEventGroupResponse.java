// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRiskEventGroupResponse setBody(DescribeRiskEventGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventGroupResponseBody getBody() {
        return this.body;
    }

}
