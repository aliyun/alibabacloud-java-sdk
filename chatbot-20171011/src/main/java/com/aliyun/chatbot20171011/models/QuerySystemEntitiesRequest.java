// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QuerySystemEntitiesRequest extends TeaModel {
    @NameInMap("EntityName")
    public String entityName;

    public static QuerySystemEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEntitiesRequest self = new QuerySystemEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemEntitiesRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
