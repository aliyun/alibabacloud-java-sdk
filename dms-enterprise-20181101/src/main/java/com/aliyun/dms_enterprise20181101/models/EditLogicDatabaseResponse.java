// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditLogicDatabaseResponseBody body;

    public static EditLogicDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        EditLogicDatabaseResponse self = new EditLogicDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public EditLogicDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditLogicDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditLogicDatabaseResponse setBody(EditLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public EditLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
