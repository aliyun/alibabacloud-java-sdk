// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSynchronizingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForSynchronizingDnsHostResponseBody body;

    public static SaveSingleTaskForSynchronizingDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSynchronizingDnsHostResponse self = new SaveSingleTaskForSynchronizingDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse setBody(SaveSingleTaskForSynchronizingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForSynchronizingDnsHostResponseBody getBody() {
        return this.body;
    }

}
