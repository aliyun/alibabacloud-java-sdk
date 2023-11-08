// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataChunkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    public static GetEnterpriseDataChunkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataChunkRequest self = new GetEnterpriseDataChunkRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataChunkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetEnterpriseDataChunkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
