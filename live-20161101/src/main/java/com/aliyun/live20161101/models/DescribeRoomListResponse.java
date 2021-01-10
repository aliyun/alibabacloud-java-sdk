// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoomListResponseBody body;

    public static DescribeRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomListResponse self = new DescribeRoomListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoomListResponse setBody(DescribeRoomListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoomListResponseBody getBody() {
        return this.body;
    }

}
