// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInvitationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvitationListResponseBody body;

    public static DescribeInvitationListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvitationListResponse self = new DescribeInvitationListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvitationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvitationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvitationListResponse setBody(DescribeInvitationListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvitationListResponseBody getBody() {
        return this.body;
    }

}
