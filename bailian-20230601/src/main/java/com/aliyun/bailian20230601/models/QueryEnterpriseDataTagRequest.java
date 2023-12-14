// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DataId")
    public String dataId;

    public static QueryEnterpriseDataTagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataTagRequest self = new QueryEnterpriseDataTagRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryEnterpriseDataTagRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
