// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForDeletingDSRecordResponse setBody(SaveSingleTaskForDeletingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForDeletingDSRecordResponseBody getBody() {
        return this.body;
    }

}
