// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCreatingDnsHostResponseBody body;

    public static SaveSingleTaskForCreatingDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingDnsHostResponse self = new SaveSingleTaskForCreatingDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingDnsHostResponse setBody(SaveSingleTaskForCreatingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingDnsHostResponseBody getBody() {
        return this.body;
    }

}
