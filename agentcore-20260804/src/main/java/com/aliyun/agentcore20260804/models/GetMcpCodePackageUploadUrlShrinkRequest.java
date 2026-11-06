// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpCodePackageUploadUrlShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static GetMcpCodePackageUploadUrlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcpCodePackageUploadUrlShrinkRequest self = new GetMcpCodePackageUploadUrlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMcpCodePackageUploadUrlShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
