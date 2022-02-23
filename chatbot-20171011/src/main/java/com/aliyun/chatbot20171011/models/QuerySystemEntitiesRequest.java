// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QuerySystemEntitiesRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EntityName")
    public String entityName;

    public static QuerySystemEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEntitiesRequest self = new QuerySystemEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemEntitiesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QuerySystemEntitiesRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
