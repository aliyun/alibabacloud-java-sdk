// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckModifyConfigNeedRestartResponseBody body;

    public static CheckModifyConfigNeedRestartResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartResponse self = new CheckModifyConfigNeedRestartResponse();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckModifyConfigNeedRestartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckModifyConfigNeedRestartResponse setBody(CheckModifyConfigNeedRestartResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckModifyConfigNeedRestartResponseBody getBody() {
        return this.body;
    }

}
