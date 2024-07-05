// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotImportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFpShotImportJobResponseBody body;

    public static ListFpShotImportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotImportJobResponse self = new ListFpShotImportJobResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotImportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotImportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFpShotImportJobResponse setBody(ListFpShotImportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotImportJobResponseBody getBody() {
        return this.body;
    }

}
