// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveMessageGroupBandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveMessageGroupBandResponseBody body;

    public static AddLiveMessageGroupBandResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveMessageGroupBandResponse self = new AddLiveMessageGroupBandResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveMessageGroupBandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveMessageGroupBandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveMessageGroupBandResponse setBody(AddLiveMessageGroupBandResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveMessageGroupBandResponseBody getBody() {
        return this.body;
    }

}
