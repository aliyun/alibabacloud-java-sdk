// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageUploadUrlShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static GetAgentCodePackageUploadUrlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageUploadUrlShrinkRequest self = new GetAgentCodePackageUploadUrlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageUploadUrlShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
