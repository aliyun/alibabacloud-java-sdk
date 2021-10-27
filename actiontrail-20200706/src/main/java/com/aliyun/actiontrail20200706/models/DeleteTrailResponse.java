// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteTrailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrailResponseBody body;

    public static DeleteTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrailResponse self = new DeleteTrailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrailResponse setBody(DeleteTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrailResponseBody getBody() {
        return this.body;
    }

}
