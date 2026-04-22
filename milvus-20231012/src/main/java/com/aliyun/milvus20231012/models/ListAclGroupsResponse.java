// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ListAclGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAclGroupsResponseBody body;

    public static ListAclGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclGroupsResponse self = new ListAclGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAclGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAclGroupsResponse setBody(ListAclGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclGroupsResponseBody getBody() {
        return this.body;
    }

}
