// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListSmartGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmartGroupResponseBody body;

    public static ListSmartGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartGroupResponse self = new ListSmartGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartGroupResponse setBody(ListSmartGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartGroupResponseBody getBody() {
        return this.body;
    }

}
