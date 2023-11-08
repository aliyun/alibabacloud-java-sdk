// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataPageImageRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    public static GetEnterpriseDataPageImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataPageImageRequest self = new GetEnterpriseDataPageImageRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataPageImageRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetEnterpriseDataPageImageRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
