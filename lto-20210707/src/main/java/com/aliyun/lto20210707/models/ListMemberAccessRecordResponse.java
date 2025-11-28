// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAccessRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemberAccessRecordResponseBody body;

    public static ListMemberAccessRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAccessRecordResponse self = new ListMemberAccessRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListMemberAccessRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemberAccessRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemberAccessRecordResponse setBody(ListMemberAccessRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemberAccessRecordResponseBody getBody() {
        return this.body;
    }

}
