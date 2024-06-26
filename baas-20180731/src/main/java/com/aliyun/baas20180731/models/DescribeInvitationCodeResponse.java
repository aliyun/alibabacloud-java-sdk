// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInvitationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvitationCodeResponseBody body;

    public static DescribeInvitationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvitationCodeResponse self = new DescribeInvitationCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvitationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvitationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvitationCodeResponse setBody(DescribeInvitationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvitationCodeResponseBody getBody() {
        return this.body;
    }

}
