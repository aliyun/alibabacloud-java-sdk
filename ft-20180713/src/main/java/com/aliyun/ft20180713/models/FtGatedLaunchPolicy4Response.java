// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtGatedLaunchPolicy4Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FtGatedLaunchPolicy4ResponseBody body;

    public static FtGatedLaunchPolicy4Response build(java.util.Map<String, ?> map) throws Exception {
        FtGatedLaunchPolicy4Response self = new FtGatedLaunchPolicy4Response();
        return TeaModel.build(map, self);
    }

    public FtGatedLaunchPolicy4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtGatedLaunchPolicy4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FtGatedLaunchPolicy4Response setBody(FtGatedLaunchPolicy4ResponseBody body) {
        this.body = body;
        return this;
    }
    public FtGatedLaunchPolicy4ResponseBody getBody() {
        return this.body;
    }

}
