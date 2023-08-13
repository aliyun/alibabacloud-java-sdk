// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableSqlConcurrencyControlRequest extends TeaModel {
    /**
     * <p>The duration within which the SQL throttling rule takes effect. Unit: seconds.</p>
     * <br>
     * <p>>  The throttling rule takes effect only within this duration.</p>
     */
    @NameInMap("ConcurrencyControlTime")
    public Long concurrencyControlTime;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>>  You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of concurrent SQL statements. Set this parameter to a positive integer.</p>
     * <br>
     * <p>>  When the number of concurrent SQL statements that contain the specified keywords reaches this upper limit, the throttling rule is triggered.</p>
     */
    @NameInMap("MaxConcurrency")
    public Long maxConcurrency;

    /**
     * <p>The keywords that are used to identify the SQL statements that need to be throttled.</p>
     * <br>
     * <p>>  If you specify multiple SQL keywords, separate them with tildes (~). If the number of concurrent SQL statements that contain all the specified SQL keywords reaches the specified upper limit, the throttling rule is triggered.</p>
     */
    @NameInMap("SqlKeywords")
    public String sqlKeywords;

    /**
     * <p>The type of the SQL statements. Valid values:</p>
     * <br>
     * <p>*   **SELECT**</p>
     * <p>*   **UPDATE**</p>
     * <p>*   **DELETE**</p>
     */
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
