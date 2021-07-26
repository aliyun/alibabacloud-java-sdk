// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateInformationKeyActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInformationKeyActionResponseBody body;

    public static UpdateInformationKeyActionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInformationKeyActionResponse self = new UpdateInformationKeyActionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInformationKeyActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInformationKeyActionResponse setBody(UpdateInformationKeyActionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInformationKeyActionResponseBody getBody() {
        return this.body;
    }

}
