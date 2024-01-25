// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveSingleTaskForCreatingDnsHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForCreatingDnsHostResponse setBody(SaveSingleTaskForCreatingDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingDnsHostResponseBody getBody() {
        return this.body;
    }

}
