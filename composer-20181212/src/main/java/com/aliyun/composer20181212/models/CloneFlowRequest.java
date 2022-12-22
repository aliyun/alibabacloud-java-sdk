// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowRequest extends TeaModel {
    // The ID of the workflow that you want to clone.
    @NameInMap("FlowId")
    public String flowId;

    // The version of the workflow that you want to clone. If you do not specify this parameter, the latest version of the workflow is cloned.
    @NameInMap("VersionId")
    public String versionId;

    public static CloneFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowRequest self = new CloneFlowRequest();
        return TeaModel.build(map, self);
    }

    public CloneFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CloneFlowRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
