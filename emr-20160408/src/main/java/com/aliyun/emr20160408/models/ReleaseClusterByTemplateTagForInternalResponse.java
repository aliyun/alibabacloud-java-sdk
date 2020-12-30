// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ReleaseClusterByTemplateTagForInternalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseClusterByTemplateTagForInternalResponseBody body;

    public static ReleaseClusterByTemplateTagForInternalResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterByTemplateTagForInternalResponse self = new ReleaseClusterByTemplateTagForInternalResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterByTemplateTagForInternalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseClusterByTemplateTagForInternalResponse setBody(ReleaseClusterByTemplateTagForInternalResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterByTemplateTagForInternalResponseBody getBody() {
        return this.body;
    }

}
