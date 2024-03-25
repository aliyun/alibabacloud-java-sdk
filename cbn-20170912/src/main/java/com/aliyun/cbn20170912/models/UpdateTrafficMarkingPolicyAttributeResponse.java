// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficMarkingPolicyAttributeResponseBody body;

    public static UpdateTrafficMarkingPolicyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMarkingPolicyAttributeResponse self = new UpdateTrafficMarkingPolicyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMarkingPolicyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficMarkingPolicyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficMarkingPolicyAttributeResponse setBody(UpdateTrafficMarkingPolicyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficMarkingPolicyAttributeResponseBody getBody() {
        return this.body;
    }

}
