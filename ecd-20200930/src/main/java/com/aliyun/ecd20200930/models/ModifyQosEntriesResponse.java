// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyQosEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyQosEntriesResponseBody body;

    public static ModifyQosEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosEntriesResponse self = new ModifyQosEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQosEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQosEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQosEntriesResponse setBody(ModifyQosEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQosEntriesResponseBody getBody() {
        return this.body;
    }

}
