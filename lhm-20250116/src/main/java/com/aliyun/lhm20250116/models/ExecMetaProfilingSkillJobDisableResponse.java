// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaProfilingSkillJobDisableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecMetaProfilingSkillJobDisableResponseBody body;

    public static ExecMetaProfilingSkillJobDisableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaProfilingSkillJobDisableResponse self = new ExecMetaProfilingSkillJobDisableResponse();
        return TeaModel.build(map, self);
    }

    public ExecMetaProfilingSkillJobDisableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecMetaProfilingSkillJobDisableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecMetaProfilingSkillJobDisableResponse setBody(ExecMetaProfilingSkillJobDisableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecMetaProfilingSkillJobDisableResponseBody getBody() {
        return this.body;
    }

}
