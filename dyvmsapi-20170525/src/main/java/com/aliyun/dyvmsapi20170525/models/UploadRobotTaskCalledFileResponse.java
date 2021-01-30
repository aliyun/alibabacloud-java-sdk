// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadRobotTaskCalledFileResponseBody body;

    public static UploadRobotTaskCalledFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRobotTaskCalledFileResponse self = new UploadRobotTaskCalledFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadRobotTaskCalledFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadRobotTaskCalledFileResponse setBody(UploadRobotTaskCalledFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRobotTaskCalledFileResponseBody getBody() {
        return this.body;
    }

}
