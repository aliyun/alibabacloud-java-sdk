// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchPhysicalDtsJobToCloudResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchPhysicalDtsJobToCloudResponseBody body;

    public static SwitchPhysicalDtsJobToCloudResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchPhysicalDtsJobToCloudResponse self = new SwitchPhysicalDtsJobToCloudResponse();
        return TeaModel.build(map, self);
    }

    public SwitchPhysicalDtsJobToCloudResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchPhysicalDtsJobToCloudResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchPhysicalDtsJobToCloudResponse setBody(SwitchPhysicalDtsJobToCloudResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchPhysicalDtsJobToCloudResponseBody getBody() {
        return this.body;
    }

}
