// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeEniQosGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEniQosGroupInfoResponseBody body;

    public static DescribeEniQosGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniQosGroupInfoResponse self = new DescribeEniQosGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEniQosGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEniQosGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEniQosGroupInfoResponse setBody(DescribeEniQosGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEniQosGroupInfoResponseBody getBody() {
        return this.body;
    }

}
