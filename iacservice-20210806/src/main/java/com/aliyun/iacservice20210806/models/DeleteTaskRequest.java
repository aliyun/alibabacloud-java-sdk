// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    /**
     * <p>The data retention policy. If this parameter is not specified, the policy is unconfirmed. If the node has resources or the resource status is unknown, the operation returns a confirmation fault. Set this parameter to RETAIN to delete only the node management record and retain the cloud resources.</p>
     */
    @NameInMap("resourceRetentionPolicy")
    public String resourceRetentionPolicy;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setResourceRetentionPolicy(String resourceRetentionPolicy) {
        this.resourceRetentionPolicy = resourceRetentionPolicy;
        return this;
    }
    public String getResourceRetentionPolicy() {
        return this.resourceRetentionPolicy;
    }

}
