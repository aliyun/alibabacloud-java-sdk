// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumAdminStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumAdminStatusResponseBody body;

    public static DescribeConsortiumAdminStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumAdminStatusResponse self = new DescribeConsortiumAdminStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumAdminStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumAdminStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumAdminStatusResponse setBody(DescribeConsortiumAdminStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumAdminStatusResponseBody getBody() {
        return this.body;
    }

}
