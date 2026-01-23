// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateQualityWatchSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityWatchSwitchResponseBody body;

    public static UpdateQualityWatchSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityWatchSwitchResponse self = new UpdateQualityWatchSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityWatchSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityWatchSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityWatchSwitchResponse setBody(UpdateQualityWatchSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityWatchSwitchResponseBody getBody() {
        return this.body;
    }

}
