// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForDeletingDnsHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForDeletingDnsHostResponse setBody(SaveSingleTaskForDeletingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDeletingDnsHostResponseBody getBody() {
        return this.body;
    }

}
