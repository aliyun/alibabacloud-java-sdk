// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDesktopsInGroupResponseBody body;

    public static DescribeDesktopsInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsInGroupResponse self = new DescribeDesktopsInGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopsInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDesktopsInGroupResponse setBody(DescribeDesktopsInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopsInGroupResponseBody getBody() {
        return this.body;
    }

}
