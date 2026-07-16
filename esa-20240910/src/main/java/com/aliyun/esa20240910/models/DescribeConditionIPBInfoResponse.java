// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeConditionIPBInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConditionIPBInfoResponseBody body;

    public static DescribeConditionIPBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConditionIPBInfoResponse self = new DescribeConditionIPBInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConditionIPBInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConditionIPBInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConditionIPBInfoResponse setBody(DescribeConditionIPBInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConditionIPBInfoResponseBody getBody() {
        return this.body;
    }

}
