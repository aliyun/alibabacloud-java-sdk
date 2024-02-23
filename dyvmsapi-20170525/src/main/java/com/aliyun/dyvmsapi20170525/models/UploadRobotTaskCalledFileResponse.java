// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UploadRobotTaskCalledFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadRobotTaskCalledFileResponse setBody(UploadRobotTaskCalledFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRobotTaskCalledFileResponseBody getBody() {
        return this.body;
    }

}
