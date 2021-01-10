// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateBuiltinFunctionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ArtifactUploadUrl")
    public String artifactUploadUrl;

    public static CreateBuiltinFunctionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuiltinFunctionTemplateResponseBody self = new CreateBuiltinFunctionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBuiltinFunctionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBuiltinFunctionTemplateResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBuiltinFunctionTemplateResponseBody setArtifactUploadUrl(String artifactUploadUrl) {
        this.artifactUploadUrl = artifactUploadUrl;
        return this;
    }
    public String getArtifactUploadUrl() {
        return this.artifactUploadUrl;
    }

}
