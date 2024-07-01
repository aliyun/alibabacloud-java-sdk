// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkTemplateFileIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkTemplateFileIdsResponseBody body;

    public static ListSparkTemplateFileIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkTemplateFileIdsResponse self = new ListSparkTemplateFileIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkTemplateFileIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkTemplateFileIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkTemplateFileIdsResponse setBody(ListSparkTemplateFileIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkTemplateFileIdsResponseBody getBody() {
        return this.body;
    }

}
