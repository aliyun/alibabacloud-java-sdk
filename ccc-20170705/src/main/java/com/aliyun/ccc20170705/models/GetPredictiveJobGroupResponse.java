// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetPredictiveJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPredictiveJobGroupResponseBody body;

    public static GetPredictiveJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPredictiveJobGroupResponse self = new GetPredictiveJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetPredictiveJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPredictiveJobGroupResponse setBody(GetPredictiveJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPredictiveJobGroupResponseBody getBody() {
        return this.body;
    }

}
