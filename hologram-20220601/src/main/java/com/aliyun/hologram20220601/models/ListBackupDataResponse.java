// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListBackupDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBackupDataResponseBody body;

    public static ListBackupDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackupDataResponse self = new ListBackupDataResponse();
        return TeaModel.build(map, self);
    }

    public ListBackupDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackupDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBackupDataResponse setBody(ListBackupDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackupDataResponseBody getBody() {
        return this.body;
    }

}
