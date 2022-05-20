// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetQueueAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetQueueAttributesResponseBody body;

    public static SetQueueAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetQueueAttributesResponse self = new SetQueueAttributesResponse();
        return TeaModel.build(map, self);
    }

    public SetQueueAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetQueueAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetQueueAttributesResponse setBody(SetQueueAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetQueueAttributesResponseBody getBody() {
        return this.body;
    }

}
