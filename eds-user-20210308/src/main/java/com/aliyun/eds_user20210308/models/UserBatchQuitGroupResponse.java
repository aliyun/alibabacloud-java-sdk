// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchQuitGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UserBatchQuitGroupResponseBody body;

    public static UserBatchQuitGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UserBatchQuitGroupResponse self = new UserBatchQuitGroupResponse();
        return TeaModel.build(map, self);
    }

    public UserBatchQuitGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserBatchQuitGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserBatchQuitGroupResponse setBody(UserBatchQuitGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UserBatchQuitGroupResponseBody getBody() {
        return this.body;
    }

}
