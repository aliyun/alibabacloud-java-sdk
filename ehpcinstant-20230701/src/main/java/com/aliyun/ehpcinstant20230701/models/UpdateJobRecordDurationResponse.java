// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateJobRecordDurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobRecordDurationResponseBody body;

    public static UpdateJobRecordDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRecordDurationResponse self = new UpdateJobRecordDurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobRecordDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobRecordDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobRecordDurationResponse setBody(UpdateJobRecordDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobRecordDurationResponseBody getBody() {
        return this.body;
    }

}
