// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataCorrectPreCheckSQLResponseBody body;

    public static ListDataCorrectPreCheckSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckSQLResponse self = new ListDataCorrectPreCheckSQLResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCorrectPreCheckSQLResponse setBody(ListDataCorrectPreCheckSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCorrectPreCheckSQLResponseBody getBody() {
        return this.body;
    }

}
