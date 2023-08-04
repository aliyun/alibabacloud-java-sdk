// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseDataRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    public static DeleteEnterpriseDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseDataRequest self = new DeleteEnterpriseDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseDataRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteEnterpriseDataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
