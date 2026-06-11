// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DownloadSkillVersionViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSkillVersionViaOssResponseBody body;

    public static DownloadSkillVersionViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSkillVersionViaOssResponse self = new DownloadSkillVersionViaOssResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSkillVersionViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSkillVersionViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSkillVersionViaOssResponse setBody(DownloadSkillVersionViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSkillVersionViaOssResponseBody getBody() {
        return this.body;
    }

}
