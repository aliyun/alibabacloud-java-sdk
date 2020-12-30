// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobsByGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobsByGroupResponseBody body;

    public static ListJobsByGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupResponse self = new ListJobsByGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobsByGroupResponse setBody(ListJobsByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobsByGroupResponseBody getBody() {
        return this.body;
    }

}
