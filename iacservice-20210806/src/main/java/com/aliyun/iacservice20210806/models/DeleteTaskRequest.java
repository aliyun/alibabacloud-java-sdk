// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    /**
     * <p>The data retention policy for resources. If this parameter is not specified, it indicates that the deletion is not confirmed. If the node has resources or the resource status is unknown, the API returns a confirmation fault. If you set this parameter to RETAIN, only the node management record is deleted and the cloud resources are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>RETAIN</p>
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
