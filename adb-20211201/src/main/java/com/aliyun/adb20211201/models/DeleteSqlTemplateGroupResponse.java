// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSqlTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSqlTemplateGroupResponseBody body;

    public static DeleteSqlTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlTemplateGroupResponse self = new DeleteSqlTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSqlTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSqlTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSqlTemplateGroupResponse setBody(DeleteSqlTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSqlTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
