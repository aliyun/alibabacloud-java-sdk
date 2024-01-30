// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAssociatingEnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForAssociatingEnsResponseBody body;

    public static SaveSingleTaskForAssociatingEnsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAssociatingEnsResponse self = new SaveSingleTaskForAssociatingEnsResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAssociatingEnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForAssociatingEnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForAssociatingEnsResponse setBody(SaveSingleTaskForAssociatingEnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForAssociatingEnsResponseBody getBody() {
        return this.body;
    }

}
