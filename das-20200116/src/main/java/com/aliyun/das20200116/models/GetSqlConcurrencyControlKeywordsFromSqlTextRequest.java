// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlKeywordsFromSqlTextRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze5hpn2b99d2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SQL statement based on which a throttling keyword string is to be generated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM test where name = \&quot;das\&quot;</p>
     */
    @NameInMap("SqlText")
    public String sqlText;

    public static GetSqlConcurrencyControlKeywordsFromSqlTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlKeywordsFromSqlTextRequest self = new GetSqlConcurrencyControlKeywordsFromSqlTextRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextRequest setSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }
    public String getSqlText() {
        return this.sqlText;
    }

}
