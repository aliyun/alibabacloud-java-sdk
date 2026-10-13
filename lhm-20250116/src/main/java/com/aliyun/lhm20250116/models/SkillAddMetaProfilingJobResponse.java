// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SkillAddMetaProfilingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkillAddMetaProfilingJobResponseBody body;

    public static SkillAddMetaProfilingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SkillAddMetaProfilingJobResponse self = new SkillAddMetaProfilingJobResponse();
        return TeaModel.build(map, self);
    }

    public SkillAddMetaProfilingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkillAddMetaProfilingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkillAddMetaProfilingJobResponse setBody(SkillAddMetaProfilingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SkillAddMetaProfilingJobResponseBody getBody() {
        return this.body;
    }

}
