// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordVodConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveRecordVodConfigResponseBody body;

    public static UpdateLiveRecordVodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordVodConfigResponse self = new UpdateLiveRecordVodConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordVodConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveRecordVodConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveRecordVodConfigResponse setBody(UpdateLiveRecordVodConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

}
