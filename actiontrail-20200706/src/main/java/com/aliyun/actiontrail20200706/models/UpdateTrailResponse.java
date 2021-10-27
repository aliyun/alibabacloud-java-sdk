// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateTrailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrailResponseBody body;

    public static UpdateTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrailResponse self = new UpdateTrailResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrailResponse setBody(UpdateTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrailResponseBody getBody() {
        return this.body;
    }

}
