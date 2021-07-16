// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveProblemServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveProblemServiceGroupResponseBody body;

    public static RemoveProblemServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveProblemServiceGroupResponse self = new RemoveProblemServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveProblemServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveProblemServiceGroupResponse setBody(RemoveProblemServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveProblemServiceGroupResponseBody getBody() {
        return this.body;
    }

}
