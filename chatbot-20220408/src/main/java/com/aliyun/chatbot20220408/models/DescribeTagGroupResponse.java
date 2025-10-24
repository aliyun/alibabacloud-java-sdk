// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagGroupResponseBody body;

    public static DescribeTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagGroupResponse self = new DescribeTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagGroupResponse setBody(DescribeTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagGroupResponseBody getBody() {
        return this.body;
    }

}
