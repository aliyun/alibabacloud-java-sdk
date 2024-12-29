// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsHiveJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApsHiveJobResponseBody body;

    public static CreateApsHiveJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApsHiveJobResponse self = new CreateApsHiveJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateApsHiveJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApsHiveJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApsHiveJobResponse setBody(CreateApsHiveJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApsHiveJobResponseBody getBody() {
        return this.body;
    }

}
