// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionRequest extends TeaModel {
    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    @NameInMap("VersionId")
    @Validation(required = true)
    public Integer versionId;

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

    public GetVersionRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
