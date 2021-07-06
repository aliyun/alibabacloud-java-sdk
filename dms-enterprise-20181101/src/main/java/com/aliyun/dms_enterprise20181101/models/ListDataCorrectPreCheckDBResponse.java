// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataCorrectPreCheckDBResponseBody body;

    public static ListDataCorrectPreCheckDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckDBResponse self = new ListDataCorrectPreCheckDBResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCorrectPreCheckDBResponse setBody(ListDataCorrectPreCheckDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCorrectPreCheckDBResponseBody getBody() {
        return this.body;
    }

}
