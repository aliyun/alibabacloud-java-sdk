// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PublishPredictiveJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishPredictiveJobGroupResponseBody body;

    public static PublishPredictiveJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishPredictiveJobGroupResponse self = new PublishPredictiveJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public PublishPredictiveJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishPredictiveJobGroupResponse setBody(PublishPredictiveJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishPredictiveJobGroupResponseBody getBody() {
        return this.body;
    }

}
