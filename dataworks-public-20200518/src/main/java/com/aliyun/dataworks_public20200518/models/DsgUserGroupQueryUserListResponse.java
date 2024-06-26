// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUserGroupQueryUserListResponseBody body;

    public static DsgUserGroupQueryUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryUserListResponse self = new DsgUserGroupQueryUserListResponse();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUserGroupQueryUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUserGroupQueryUserListResponse setBody(DsgUserGroupQueryUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUserGroupQueryUserListResponseBody getBody() {
        return this.body;
    }

}
