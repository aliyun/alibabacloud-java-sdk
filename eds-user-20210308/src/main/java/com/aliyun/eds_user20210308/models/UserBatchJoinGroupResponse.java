// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchJoinGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UserBatchJoinGroupResponseBody body;

    public static UserBatchJoinGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UserBatchJoinGroupResponse self = new UserBatchJoinGroupResponse();
        return TeaModel.build(map, self);
    }

    public UserBatchJoinGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserBatchJoinGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserBatchJoinGroupResponse setBody(UserBatchJoinGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UserBatchJoinGroupResponseBody getBody() {
        return this.body;
    }

}
