// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumMemberApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumMemberApprovalResponseBody body;

    public static DescribeConsortiumMemberApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumMemberApprovalResponse self = new DescribeConsortiumMemberApprovalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumMemberApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumMemberApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumMemberApprovalResponse setBody(DescribeConsortiumMemberApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumMemberApprovalResponseBody getBody() {
        return this.body;
    }

}
