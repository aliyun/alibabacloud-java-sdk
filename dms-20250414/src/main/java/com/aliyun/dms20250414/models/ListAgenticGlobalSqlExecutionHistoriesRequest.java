// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticGlobalSqlExecutionHistoriesRequest extends TeaModel {
    /**
     * <p>The ID of the executor. User IDs start with usr_, and agent IDs start with agt_. If you do not specify this parameter, all records within the current tenant are queried. If you specify a user ID, the records of the user and their agents are included. If you specify an agent ID, only the records of the agent are matched. The executor must belong to the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_10001</p>
     */
    @NameInMap("ActorId")
    public String actorId;

    /**
     * <p>The name of the executor for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-user</p>
     */
    @NameInMap("ActorName")
    public String actorName;

    /**
     * <p>The type of the executor for exact match. Valid values: HUMAN and AGENT.</p>
     * 
     * <strong>example:</strong>
     * <p>HUMAN</p>
     */
    @NameInMap("ActorType")
    public String actorType;

    /**
     * <p>The Catalog UUID for exact match. You can obtain this value by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The Database UUID for exact match. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss. Default value: the current time. If the format cannot be parsed or the end time is earlier than the start time, the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The execution scenario for exact match. Valid values: AGENT_QUERY (the agent directly executes the SQL statement) and WORKFLOW_QUERY (the SQL statement is asynchronously executed through a workflow). If you do not specify this parameter, both scenarios are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT_QUERY</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The keyword for fuzzy match against the original SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlKeyword")
    public String sqlKeyword;

    /**
     * <p>The SQL type for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss. Default value: the last 7 days. If the specified time is earlier than 730 days ago or the format cannot be parsed, the query starts from 730 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListAgenticGlobalSqlExecutionHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticGlobalSqlExecutionHistoriesRequest self = new ListAgenticGlobalSqlExecutionHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setSqlKeyword(String sqlKeyword) {
        this.sqlKeyword = sqlKeyword;
        return this;
    }
    public String getSqlKeyword() {
        return this.sqlKeyword;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public ListAgenticGlobalSqlExecutionHistoriesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
