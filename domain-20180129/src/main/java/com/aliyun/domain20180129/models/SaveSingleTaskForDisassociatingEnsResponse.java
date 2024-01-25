// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDisassociatingEnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForDisassociatingEnsResponseBody body;

    public static SaveSingleTaskForDisassociatingEnsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDisassociatingEnsResponse self = new SaveSingleTaskForDisassociatingEnsResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDisassociatingEnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForDisassociatingEnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForDisassociatingEnsResponse setBody(SaveSingleTaskForDisassociatingEnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDisassociatingEnsResponseBody getBody() {
        return this.body;
    }

}
