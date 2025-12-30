// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AlterSearchLibResponseBody body;

    public static AlterSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchLibResponse self = new AlterSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public AlterSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlterSearchLibResponse setBody(AlterSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterSearchLibResponseBody getBody() {
        return this.body;
    }

}
