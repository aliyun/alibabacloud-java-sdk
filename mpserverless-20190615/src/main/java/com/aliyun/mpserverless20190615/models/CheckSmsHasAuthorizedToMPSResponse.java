// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckSmsHasAuthorizedToMPSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSmsHasAuthorizedToMPSResponseBody body;

    public static CheckSmsHasAuthorizedToMPSResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsHasAuthorizedToMPSResponse self = new CheckSmsHasAuthorizedToMPSResponse();
        return TeaModel.build(map, self);
    }

    public CheckSmsHasAuthorizedToMPSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSmsHasAuthorizedToMPSResponse setBody(CheckSmsHasAuthorizedToMPSResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSmsHasAuthorizedToMPSResponseBody getBody() {
        return this.body;
    }

}
