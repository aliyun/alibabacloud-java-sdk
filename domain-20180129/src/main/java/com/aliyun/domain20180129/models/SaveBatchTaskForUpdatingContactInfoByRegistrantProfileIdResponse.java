// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body;

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse self = new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse setBody(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody getBody() {
        return this.body;
    }

}
