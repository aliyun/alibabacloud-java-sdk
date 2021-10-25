// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EditLogicDatabaseResponse setBody(EditLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public EditLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
