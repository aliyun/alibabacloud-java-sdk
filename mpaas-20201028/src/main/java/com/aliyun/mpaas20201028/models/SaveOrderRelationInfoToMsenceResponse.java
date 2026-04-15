// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveOrderRelationInfoToMsenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveOrderRelationInfoToMsenceResponseBody body;

    public static SaveOrderRelationInfoToMsenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderRelationInfoToMsenceResponse self = new SaveOrderRelationInfoToMsenceResponse();
        return TeaModel.build(map, self);
    }

    public SaveOrderRelationInfoToMsenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOrderRelationInfoToMsenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveOrderRelationInfoToMsenceResponse setBody(SaveOrderRelationInfoToMsenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOrderRelationInfoToMsenceResponseBody getBody() {
        return this.body;
    }

}
