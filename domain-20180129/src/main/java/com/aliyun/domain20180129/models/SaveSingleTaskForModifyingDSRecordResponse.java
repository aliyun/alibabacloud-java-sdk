// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForModifyingDSRecordResponseBody body;

    public static SaveSingleTaskForModifyingDSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForModifyingDSRecordResponse self = new SaveSingleTaskForModifyingDSRecordResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForModifyingDSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForModifyingDSRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForModifyingDSRecordResponse setBody(SaveSingleTaskForModifyingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForModifyingDSRecordResponseBody getBody() {
        return this.body;
    }

}
