// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotImportJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFpShotImportJobResponseBody body;

    public static ListFpShotImportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotImportJobResponse self = new ListFpShotImportJobResponse();
        return TeaModel.build(map, self);
    }

    public ListFpShotImportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFpShotImportJobResponse setBody(ListFpShotImportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFpShotImportJobResponseBody getBody() {
        return this.body;
    }

}
