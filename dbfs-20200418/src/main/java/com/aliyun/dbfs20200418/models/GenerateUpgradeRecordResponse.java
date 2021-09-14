// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GenerateUpgradeRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateUpgradeRecordResponseBody body;

    public static GenerateUpgradeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeRecordResponse self = new GenerateUpgradeRecordResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUpgradeRecordResponse setBody(GenerateUpgradeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUpgradeRecordResponseBody getBody() {
        return this.body;
    }

}
