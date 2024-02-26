// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConfSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScheduleConfSettingsResponseBody body;

    public static UpdateScheduleConfSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConfSettingsResponse self = new UpdateScheduleConfSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConfSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleConfSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduleConfSettingsResponse setBody(UpdateScheduleConfSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleConfSettingsResponseBody getBody() {
        return this.body;
    }

}
