// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomKickoutUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoomKickoutUserListResponseBody body;

    public static DescribeRoomKickoutUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomKickoutUserListResponse self = new DescribeRoomKickoutUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomKickoutUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoomKickoutUserListResponse setBody(DescribeRoomKickoutUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoomKickoutUserListResponseBody getBody() {
        return this.body;
    }

}
