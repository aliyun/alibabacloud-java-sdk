// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableSqlConcurrencyControlRequest extends TeaModel {
    @NameInMap("ConcurrencyControlTime")
    public Long concurrencyControlTime;

    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxConcurrency")
    public Long maxConcurrency;

    @NameInMap("SqlKeywords")
    public String sqlKeywords;

    @NameInMap("SqlType")
    public String sqlType;

    public static EnableSqlConcurrencyControlRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlConcurrencyControlRequest self = new EnableSqlConcurrencyControlRequest();
        return TeaModel.build(map, self);
    }

    public EnableSqlConcurrencyControlRequest setConcurrencyControlTime(Long concurrencyControlTime) {
        this.concurrencyControlTime = concurrencyControlTime;
        return this;
    }
    public Long getConcurrencyControlTime() {
        return this.concurrencyControlTime;
    }

    public EnableSqlConcurrencyControlRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public EnableSqlConcurrencyControlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableSqlConcurrencyControlRequest setMaxConcurrency(Long maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public EnableSqlConcurrencyControlRequest setSqlKeywords(String sqlKeywords) {
        this.sqlKeywords = sqlKeywords;
        return this;
    }
    public String getSqlKeywords() {
        return this.sqlKeywords;
    }

    public EnableSqlConcurrencyControlRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

}
