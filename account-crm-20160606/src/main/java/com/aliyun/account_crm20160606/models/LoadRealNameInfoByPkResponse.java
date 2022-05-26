// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class LoadRealNameInfoByPkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LoadRealNameInfoByPkResponseBody body;

    public static LoadRealNameInfoByPkResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadRealNameInfoByPkResponse self = new LoadRealNameInfoByPkResponse();
        return TeaModel.build(map, self);
    }

    public LoadRealNameInfoByPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadRealNameInfoByPkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoadRealNameInfoByPkResponse setBody(LoadRealNameInfoByPkResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadRealNameInfoByPkResponseBody getBody() {
        return this.body;
    }

}
