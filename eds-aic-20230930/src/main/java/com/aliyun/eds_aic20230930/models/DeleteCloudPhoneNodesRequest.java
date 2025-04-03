// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteCloudPhoneNodesRequest extends TeaModel {
    /**
     * <p>The cloud phone matrix IDs.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    public static DeleteCloudPhoneNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudPhoneNodesRequest self = new DeleteCloudPhoneNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudPhoneNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

}
