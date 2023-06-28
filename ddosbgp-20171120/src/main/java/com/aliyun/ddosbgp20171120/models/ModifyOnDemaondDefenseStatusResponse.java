// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class ModifyOnDemaondDefenseStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOnDemaondDefenseStatusResponseBody body;

    public static ModifyOnDemaondDefenseStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnDemaondDefenseStatusResponse self = new ModifyOnDemaondDefenseStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOnDemaondDefenseStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOnDemaondDefenseStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOnDemaondDefenseStatusResponse setBody(ModifyOnDemaondDefenseStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOnDemaondDefenseStatusResponseBody getBody() {
        return this.body;
    }

}
