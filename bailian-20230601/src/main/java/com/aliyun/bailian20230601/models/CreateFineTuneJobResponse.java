// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateFineTuneJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFineTuneJobResponseBody body;

    public static CreateFineTuneJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFineTuneJobResponse self = new CreateFineTuneJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateFineTuneJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFineTuneJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFineTuneJobResponse setBody(CreateFineTuneJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFineTuneJobResponseBody getBody() {
        return this.body;
    }

}
