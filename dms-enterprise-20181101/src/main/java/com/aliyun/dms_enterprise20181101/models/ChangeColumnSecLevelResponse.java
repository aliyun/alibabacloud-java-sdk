// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeColumnSecLevelResponseBody body;

    public static ChangeColumnSecLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeColumnSecLevelResponse self = new ChangeColumnSecLevelResponse();
        return TeaModel.build(map, self);
    }

    public ChangeColumnSecLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeColumnSecLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeColumnSecLevelResponse setBody(ChangeColumnSecLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeColumnSecLevelResponseBody getBody() {
        return this.body;
    }

}
