// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentDownloadUrlV2ResponseBody body;

    public static GetAgentDownloadUrlV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlV2Response self = new GetAgentDownloadUrlV2Response();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDownloadUrlV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentDownloadUrlV2Response setBody(GetAgentDownloadUrlV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDownloadUrlV2ResponseBody getBody() {
        return this.body;
    }

}
