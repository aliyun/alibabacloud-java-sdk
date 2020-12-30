// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForDeletingDnsHostResponseBody body;

    public static SaveSingleTaskForDeletingDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDnsHostResponse self = new SaveSingleTaskForDeletingDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForDeletingDnsHostResponse setBody(SaveSingleTaskForDeletingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDeletingDnsHostResponseBody getBody() {
        return this.body;
    }

}
