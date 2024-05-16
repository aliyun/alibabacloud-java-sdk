// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUserGroupQueryListResponseBody body;

    public static DsgUserGroupQueryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryListResponse self = new DsgUserGroupQueryListResponse();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUserGroupQueryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUserGroupQueryListResponse setBody(DsgUserGroupQueryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUserGroupQueryListResponseBody getBody() {
        return this.body;
    }

}
