// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnswerSqlSyntaxByMetaAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>怎么获取当前时间的字符串</p>
     */
    @NameInMap("Query")
    public String query;

    public static AnswerSqlSyntaxByMetaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        AnswerSqlSyntaxByMetaAgentRequest self = new AnswerSqlSyntaxByMetaAgentRequest();
        return TeaModel.build(map, self);
    }

    public AnswerSqlSyntaxByMetaAgentRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public AnswerSqlSyntaxByMetaAgentRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AnswerSqlSyntaxByMetaAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
