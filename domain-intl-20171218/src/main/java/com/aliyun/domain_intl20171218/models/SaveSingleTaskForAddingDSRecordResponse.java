// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAddingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForAddingDSRecordResponseBody body;

    public static SaveSingleTaskForAddingDSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAddingDSRecordResponse self = new SaveSingleTaskForAddingDSRecordResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAddingDSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForAddingDSRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForAddingDSRecordResponse setBody(SaveSingleTaskForAddingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForAddingDSRecordResponseBody getBody() {
        return this.body;
    }

}
