// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UploadScheduleDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadScheduleDutyResponseBody body;

    public static UploadScheduleDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadScheduleDutyResponse self = new UploadScheduleDutyResponse();
        return TeaModel.build(map, self);
    }

    public UploadScheduleDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadScheduleDutyResponse setBody(UploadScheduleDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadScheduleDutyResponseBody getBody() {
        return this.body;
    }

}
