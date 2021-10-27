// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("VersionId")
    public String versionId;

    public static GetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVersionRequest self = new GetVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetVersionRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
