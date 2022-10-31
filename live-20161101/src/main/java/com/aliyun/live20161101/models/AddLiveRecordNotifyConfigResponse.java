// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveRecordNotifyConfigResponseBody body;

    public static AddLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordNotifyConfigResponse self = new AddLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveRecordNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveRecordNotifyConfigResponse setBody(AddLiveRecordNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveRecordNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
