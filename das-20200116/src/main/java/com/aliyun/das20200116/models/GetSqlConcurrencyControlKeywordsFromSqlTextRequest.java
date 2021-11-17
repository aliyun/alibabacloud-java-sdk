// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlKeywordsFromSqlTextRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

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
