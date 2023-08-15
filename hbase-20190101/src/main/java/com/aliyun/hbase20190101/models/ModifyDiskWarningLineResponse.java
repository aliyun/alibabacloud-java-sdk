// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyDiskWarningLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDiskWarningLineResponseBody body;

    public static ModifyDiskWarningLineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskWarningLineResponse self = new ModifyDiskWarningLineResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskWarningLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskWarningLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskWarningLineResponse setBody(ModifyDiskWarningLineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskWarningLineResponseBody getBody() {
        return this.body;
    }

}
