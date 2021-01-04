// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSensitiveColumnsResponseBody body;

    public static ListSensitiveColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsResponse self = new ListSensitiveColumnsResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitiveColumnsResponse setBody(ListSensitiveColumnsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveColumnsResponseBody getBody() {
        return this.body;
    }

}
