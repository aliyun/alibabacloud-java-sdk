// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveRealTimeLogDeliveryResponseBody body;

    public static CreateLiveRealTimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRealTimeLogDeliveryResponse self = new CreateLiveRealTimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveRealTimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveRealTimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveRealTimeLogDeliveryResponse setBody(CreateLiveRealTimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
