// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitOssFileCopyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitOssFileCopyJobResponseBody body;

    public static SubmitOssFileCopyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOssFileCopyJobResponse self = new SubmitOssFileCopyJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOssFileCopyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOssFileCopyJobResponse setBody(SubmitOssFileCopyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOssFileCopyJobResponseBody getBody() {
        return this.body;
    }

}
