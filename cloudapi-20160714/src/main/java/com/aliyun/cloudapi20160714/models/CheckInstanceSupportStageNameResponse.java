// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportStageNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckInstanceSupportStageNameResponseBody body;

    public static CheckInstanceSupportStageNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportStageNameResponse self = new CheckInstanceSupportStageNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportStageNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceSupportStageNameResponse setBody(CheckInstanceSupportStageNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceSupportStageNameResponseBody getBody() {
        return this.body;
    }

}
