// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddJobsToPredictiveJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddJobsToPredictiveJobGroupResponseBody body;

    public static AddJobsToPredictiveJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddJobsToPredictiveJobGroupResponse self = new AddJobsToPredictiveJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddJobsToPredictiveJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddJobsToPredictiveJobGroupResponse setBody(AddJobsToPredictiveJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddJobsToPredictiveJobGroupResponseBody getBody() {
        return this.body;
    }

}
