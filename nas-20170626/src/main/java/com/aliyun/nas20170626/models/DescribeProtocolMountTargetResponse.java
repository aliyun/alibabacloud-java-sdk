// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtocolMountTargetResponseBody body;

    public static DescribeProtocolMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolMountTargetResponse self = new DescribeProtocolMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtocolMountTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtocolMountTargetResponse setBody(DescribeProtocolMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

}
