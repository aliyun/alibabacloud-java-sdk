// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataByDataIdRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetEnterpriseDataByDataIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataByDataIdRequest self = new GetEnterpriseDataByDataIdRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataByDataIdRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetEnterpriseDataByDataIdRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetEnterpriseDataByDataIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
