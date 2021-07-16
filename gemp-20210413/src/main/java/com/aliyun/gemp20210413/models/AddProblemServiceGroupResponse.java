// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class AddProblemServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProblemServiceGroupResponseBody body;

    public static AddProblemServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProblemServiceGroupResponse self = new AddProblemServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddProblemServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProblemServiceGroupResponse setBody(AddProblemServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProblemServiceGroupResponseBody getBody() {
        return this.body;
    }

}
