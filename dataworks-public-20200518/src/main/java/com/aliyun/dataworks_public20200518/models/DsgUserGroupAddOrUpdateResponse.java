// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUserGroupAddOrUpdateResponseBody body;

    public static DsgUserGroupAddOrUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupAddOrUpdateResponse self = new DsgUserGroupAddOrUpdateResponse();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupAddOrUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUserGroupAddOrUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUserGroupAddOrUpdateResponse setBody(DsgUserGroupAddOrUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUserGroupAddOrUpdateResponseBody getBody() {
        return this.body;
    }

}
