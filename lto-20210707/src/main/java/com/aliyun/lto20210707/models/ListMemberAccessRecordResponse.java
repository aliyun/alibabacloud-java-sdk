// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAccessRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMemberAccessRecordResponse setBody(ListMemberAccessRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemberAccessRecordResponseBody getBody() {
        return this.body;
    }

}
