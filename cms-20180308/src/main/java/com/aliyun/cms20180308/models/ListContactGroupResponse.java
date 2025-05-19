// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContactGroupResponseBody body;

    public static ListContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupResponse self = new ListContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContactGroupResponse setBody(ListContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactGroupResponseBody getBody() {
        return this.body;
    }

}
