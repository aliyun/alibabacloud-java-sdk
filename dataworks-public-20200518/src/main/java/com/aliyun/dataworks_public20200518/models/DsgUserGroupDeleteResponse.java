// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUserGroupDeleteResponseBody body;

    public static DsgUserGroupDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupDeleteResponse self = new DsgUserGroupDeleteResponse();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUserGroupDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUserGroupDeleteResponse setBody(DsgUserGroupDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUserGroupDeleteResponseBody getBody() {
        return this.body;
    }

}
