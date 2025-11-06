// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByConnectionAndChannelAndDeliveryTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody body;

    public static GetSendTraceByConnectionAndChannelAndDeliveryTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByConnectionAndChannelAndDeliveryTagResponse self = new GetSendTraceByConnectionAndChannelAndDeliveryTagResponse();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponse setBody(GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody getBody() {
        return this.body;
    }

}
