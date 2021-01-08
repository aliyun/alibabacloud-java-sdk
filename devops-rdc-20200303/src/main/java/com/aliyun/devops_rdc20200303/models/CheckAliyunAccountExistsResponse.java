// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CheckAliyunAccountExistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAliyunAccountExistsResponseBody body;

    public static CheckAliyunAccountExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAliyunAccountExistsResponse self = new CheckAliyunAccountExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckAliyunAccountExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAliyunAccountExistsResponse setBody(CheckAliyunAccountExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAliyunAccountExistsResponseBody getBody() {
        return this.body;
    }

}
