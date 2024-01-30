// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByNewContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody body;

    public static SaveBatchTaskForUpdatingContactInfoByNewContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByNewContactResponse self = new SaveBatchTaskForUpdatingContactInfoByNewContactResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse setBody(SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody getBody() {
        return this.body;
    }

}
