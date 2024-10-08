// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRealtimeDeliveryFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeDeliveryFieldResponseBody body;

    public static GetRealtimeDeliveryFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeDeliveryFieldResponse self = new GetRealtimeDeliveryFieldResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeDeliveryFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeDeliveryFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeDeliveryFieldResponse setBody(GetRealtimeDeliveryFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

}
