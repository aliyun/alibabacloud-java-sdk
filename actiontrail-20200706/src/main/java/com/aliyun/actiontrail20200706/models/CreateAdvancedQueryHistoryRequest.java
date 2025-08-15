// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("QuerySql")
    public String querySql;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    public static CreateAdvancedQueryHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryHistoryRequest self = new CreateAdvancedQueryHistoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryHistoryRequest setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public CreateAdvancedQueryHistoryRequest setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

}
