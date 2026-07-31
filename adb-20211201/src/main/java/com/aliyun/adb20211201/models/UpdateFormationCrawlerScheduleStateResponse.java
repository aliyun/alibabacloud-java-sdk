// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateFormationCrawlerScheduleStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFormationCrawlerScheduleStateResponseBody body;

    public static UpdateFormationCrawlerScheduleStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormationCrawlerScheduleStateResponse self = new UpdateFormationCrawlerScheduleStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFormationCrawlerScheduleStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFormationCrawlerScheduleStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFormationCrawlerScheduleStateResponse setBody(UpdateFormationCrawlerScheduleStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFormationCrawlerScheduleStateResponseBody getBody() {
        return this.body;
    }

}
