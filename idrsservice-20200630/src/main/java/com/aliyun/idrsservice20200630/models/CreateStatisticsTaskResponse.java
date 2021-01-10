// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateStatisticsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStatisticsTaskResponseBody body;

    public static CreateStatisticsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStatisticsTaskResponse self = new CreateStatisticsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateStatisticsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStatisticsTaskResponse setBody(CreateStatisticsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStatisticsTaskResponseBody getBody() {
        return this.body;
    }

}
