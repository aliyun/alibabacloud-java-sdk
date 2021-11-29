// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDataCorrectExecSQLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataCorrectExecSQLResponseBody body;

    public static ModifyDataCorrectExecSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCorrectExecSQLResponse self = new ModifyDataCorrectExecSQLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataCorrectExecSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataCorrectExecSQLResponse setBody(ModifyDataCorrectExecSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataCorrectExecSQLResponseBody getBody() {
        return this.body;
    }

}
