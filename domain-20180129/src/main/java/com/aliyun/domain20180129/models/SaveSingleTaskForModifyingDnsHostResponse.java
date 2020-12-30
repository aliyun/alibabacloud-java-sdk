// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForModifyingDnsHostResponseBody body;

    public static SaveSingleTaskForModifyingDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForModifyingDnsHostResponse self = new SaveSingleTaskForModifyingDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForModifyingDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForModifyingDnsHostResponse setBody(SaveSingleTaskForModifyingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForModifyingDnsHostResponseBody getBody() {
        return this.body;
    }

}
