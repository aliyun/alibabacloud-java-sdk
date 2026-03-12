// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTemplateIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForUpdatingContactByTemplateIdResponseBody body;

    public static SaveTaskForUpdatingContactByTemplateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTemplateIdResponse self = new SaveTaskForUpdatingContactByTemplateIdResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTemplateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForUpdatingContactByTemplateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForUpdatingContactByTemplateIdResponse setBody(SaveTaskForUpdatingContactByTemplateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForUpdatingContactByTemplateIdResponseBody getBody() {
        return this.body;
    }

}
