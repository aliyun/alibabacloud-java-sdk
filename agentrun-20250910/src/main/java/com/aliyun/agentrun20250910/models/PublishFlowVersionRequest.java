// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishFlowVersionRequest extends TeaModel {
    /**
     * <p>The input parameters for publishing a workflow version.</p>
     */
    @NameInMap("body")
    public PublishFlowVersionInput body;

    public static PublishFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowVersionRequest self = new PublishFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishFlowVersionRequest setBody(PublishFlowVersionInput body) {
        this.body = body;
        return this;
    }
    public PublishFlowVersionInput getBody() {
        return this.body;
    }

}
