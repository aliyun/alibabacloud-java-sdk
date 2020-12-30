// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingOrderRenewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForCreatingOrderRenewResponseBody body;

    public static SaveSingleTaskForCreatingOrderRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingOrderRenewResponse self = new SaveSingleTaskForCreatingOrderRenewResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingOrderRenewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForCreatingOrderRenewResponse setBody(SaveSingleTaskForCreatingOrderRenewResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForCreatingOrderRenewResponseBody getBody() {
        return this.body;
    }

}
