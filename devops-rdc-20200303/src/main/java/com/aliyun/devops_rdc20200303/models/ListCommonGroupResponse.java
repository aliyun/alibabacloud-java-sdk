// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCommonGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCommonGroupResponseBody body;

    public static ListCommonGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonGroupResponse self = new ListCommonGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonGroupResponse setBody(ListCommonGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonGroupResponseBody getBody() {
        return this.body;
    }

}
