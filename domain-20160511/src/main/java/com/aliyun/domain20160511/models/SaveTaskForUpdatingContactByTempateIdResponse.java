// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTempateIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForUpdatingContactByTempateIdResponseBody body;

    public static SaveTaskForUpdatingContactByTempateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTempateIdResponse self = new SaveTaskForUpdatingContactByTempateIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTempateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForUpdatingContactByTempateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForUpdatingContactByTempateIdResponse setBody(SaveTaskForUpdatingContactByTempateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForUpdatingContactByTempateIdResponseBody getBody() {
        return this.body;
    }

}
