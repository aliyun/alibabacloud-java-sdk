// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForUpdatingContactInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForUpdatingContactInfoResponseBody body;

    public static SaveSingleTaskForUpdatingContactInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForUpdatingContactInfoResponse self = new SaveSingleTaskForUpdatingContactInfoResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForUpdatingContactInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForUpdatingContactInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForUpdatingContactInfoResponse setBody(SaveSingleTaskForUpdatingContactInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForUpdatingContactInfoResponseBody getBody() {
        return this.body;
    }

}
