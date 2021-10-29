// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyFullTableScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFullTableScanResponseBody body;

    public static ModifyFullTableScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullTableScanResponse self = new ModifyFullTableScanResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFullTableScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFullTableScanResponse setBody(ModifyFullTableScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFullTableScanResponseBody getBody() {
        return this.body;
    }

}
