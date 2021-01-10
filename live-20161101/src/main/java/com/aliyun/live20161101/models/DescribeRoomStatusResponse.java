// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoomStatusResponseBody body;

    public static DescribeRoomStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomStatusResponse self = new DescribeRoomStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoomStatusResponse setBody(DescribeRoomStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoomStatusResponseBody getBody() {
        return this.body;
    }

}
