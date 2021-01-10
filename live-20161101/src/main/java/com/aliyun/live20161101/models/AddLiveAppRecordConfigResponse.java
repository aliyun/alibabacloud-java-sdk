// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppRecordConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveAppRecordConfigResponseBody body;

    public static AddLiveAppRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppRecordConfigResponse self = new AddLiveAppRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAppRecordConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAppRecordConfigResponse setBody(AddLiveAppRecordConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAppRecordConfigResponseBody getBody() {
        return this.body;
    }

}
