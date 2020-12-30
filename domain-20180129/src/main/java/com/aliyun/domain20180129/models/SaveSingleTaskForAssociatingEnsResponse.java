// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAssociatingEnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForAssociatingEnsResponse setBody(SaveSingleTaskForAssociatingEnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForAssociatingEnsResponseBody getBody() {
        return this.body;
    }

}
