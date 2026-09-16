// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CheckBusinessHoursResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBusinessHoursResponseBody body;

    public static CheckBusinessHoursResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBusinessHoursResponse self = new CheckBusinessHoursResponse();
        return TeaModel.build(map, self);
    }

    public CheckBusinessHoursResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBusinessHoursResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBusinessHoursResponse setBody(CheckBusinessHoursResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBusinessHoursResponseBody getBody() {
        return this.body;
    }

}
