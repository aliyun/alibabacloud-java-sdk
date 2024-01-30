// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForDeletingDSRecordResponseBody body;

    public static SaveSingleTaskForDeletingDSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDSRecordResponse self = new SaveSingleTaskForDeletingDSRecordResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForDeletingDSRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForDeletingDSRecordResponse setBody(SaveSingleTaskForDeletingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDeletingDSRecordResponseBody getBody() {
        return this.body;
    }

}
