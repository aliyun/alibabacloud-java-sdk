// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsKafkaHudiJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsKafkaHudiJobResponseBody body;

    public static CreateApsKafkaHudiJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsKafkaHudiJobResponse self = new CreateApsKafkaHudiJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsKafkaHudiJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsKafkaHudiJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsKafkaHudiJobResponse setBody(CreateApsKafkaHudiJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsKafkaHudiJobResponseBody getBody() {
        return this.body;
    }

}
