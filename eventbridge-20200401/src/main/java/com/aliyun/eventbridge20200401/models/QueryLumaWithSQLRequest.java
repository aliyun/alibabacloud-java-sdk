// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryLumaWithSQLRequest extends TeaModel {
    /**
     * <p>The name of the Agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>Rows exceeding this limit are truncated. The IsTruncated field in the response indicates whether truncation occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxRows")
    public Integer maxRows;

    /**
     * <p>Only query statements are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM my_table LIMIT 10</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static QueryLumaWithSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLumaWithSQLRequest self = new QueryLumaWithSQLRequest();
        return TeaModel.build(map, self);
    }

    public QueryLumaWithSQLRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public QueryLumaWithSQLRequest setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
        return this;
    }
    public Integer getMaxRows() {
        return this.maxRows;
    }

    public QueryLumaWithSQLRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
