// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyJDBCDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyJDBCDataSourceResponseBody body;

    public static ModifyJDBCDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyJDBCDataSourceResponse self = new ModifyJDBCDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyJDBCDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyJDBCDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyJDBCDataSourceResponse setBody(ModifyJDBCDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyJDBCDataSourceResponseBody getBody() {
        return this.body;
    }

}
