// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetQueueAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueueAttributesResponseBody body;

    public static GetQueueAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueAttributesResponse self = new GetQueueAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueAttributesResponse setBody(GetQueueAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueAttributesResponseBody getBody() {
        return this.body;
    }

}
