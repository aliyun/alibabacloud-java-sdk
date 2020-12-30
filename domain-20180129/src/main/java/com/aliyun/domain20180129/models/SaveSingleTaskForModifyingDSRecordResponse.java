// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDSRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForModifyingDSRecordResponse setBody(SaveSingleTaskForModifyingDSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForModifyingDSRecordResponseBody getBody() {
        return this.body;
    }

}
