// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddLiveRecordVodConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveRecordVodConfigResponse setBody(AddLiveRecordVodConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

}
