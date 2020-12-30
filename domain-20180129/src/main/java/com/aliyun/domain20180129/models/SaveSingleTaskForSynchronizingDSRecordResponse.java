// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSynchronizingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForSynchronizingDSRecordResponseBody body;

    public static SaveSingleTaskForSynchronizingDSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSynchronizingDSRecordResponse self = new SaveSingleTaskForSynchronizingDSRecordResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSynchronizingDSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForSynchronizingDSRecordResponse setBody(SaveSingleTaskForSynchronizingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForSynchronizingDSRecordResponseBody getBody() {
        return this.body;
    }

}
