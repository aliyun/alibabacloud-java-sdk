// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SaveDataServiceApiTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveDataServiceApiTestResultResponseBody body;

    public static SaveDataServiceApiTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDataServiceApiTestResultResponse self = new SaveDataServiceApiTestResultResponse();
        return TeaModel.build(map, self);
    }

    public SaveDataServiceApiTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDataServiceApiTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveDataServiceApiTestResultResponse setBody(SaveDataServiceApiTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDataServiceApiTestResultResponseBody getBody() {
        return this.body;
    }

}
