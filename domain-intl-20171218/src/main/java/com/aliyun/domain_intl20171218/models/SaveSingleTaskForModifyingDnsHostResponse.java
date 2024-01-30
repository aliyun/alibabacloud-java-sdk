// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForModifyingDnsHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForModifyingDnsHostResponse setBody(SaveSingleTaskForModifyingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForModifyingDnsHostResponseBody getBody() {
        return this.body;
    }

}
