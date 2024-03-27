// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCorrectBackupFilesResponseBody body;

    public static GetDataCorrectBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectBackupFilesResponse self = new GetDataCorrectBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectBackupFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCorrectBackupFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCorrectBackupFilesResponse setBody(GetDataCorrectBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectBackupFilesResponseBody getBody() {
        return this.body;
    }

}
