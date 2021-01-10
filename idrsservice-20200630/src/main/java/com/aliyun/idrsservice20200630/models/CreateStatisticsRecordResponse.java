// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateStatisticsRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStatisticsRecordResponseBody body;

    public static CreateStatisticsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStatisticsRecordResponse self = new CreateStatisticsRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateStatisticsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStatisticsRecordResponse setBody(CreateStatisticsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStatisticsRecordResponseBody getBody() {
        return this.body;
    }

}
