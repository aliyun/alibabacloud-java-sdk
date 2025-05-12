// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunWritingV2ResponseBody body;

    public static RunWritingV2Response build(java.util.Map<String, ?> map) throws Exception {
        RunWritingV2Response self = new RunWritingV2Response();
        return TeaModel.build(map, self);
    }

    public RunWritingV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunWritingV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunWritingV2Response setBody(RunWritingV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public RunWritingV2ResponseBody getBody() {
        return this.body;
    }

}
