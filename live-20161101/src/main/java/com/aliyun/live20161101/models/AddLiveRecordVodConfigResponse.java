// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveRecordVodConfigResponseBody body;

    public static AddLiveRecordVodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordVodConfigResponse self = new AddLiveRecordVodConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordVodConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveRecordVodConfigResponse setBody(AddLiveRecordVodConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

}
