// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataParseResultRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    public static GetEnterpriseDataParseResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataParseResultRequest self = new GetEnterpriseDataParseResultRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataParseResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetEnterpriseDataParseResultRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
