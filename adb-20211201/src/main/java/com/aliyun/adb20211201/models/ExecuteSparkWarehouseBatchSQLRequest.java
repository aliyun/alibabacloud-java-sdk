// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkWarehouseBatchSQLRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Dataworks。</p>
     */
    @NameInMap("Agency")
    public String agency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("ExecuteResultLimit")
    public Long executeResultLimit;

    /**
     * <strong>example:</strong>
     * <p>3600000</p>
     */
    @NameInMap("ExecuteTimeLimitInSeconds")
    public Long executeTimeLimitInSeconds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE TABLE user(id INT, name STRING);
     * INSERT INTO t VALUE(1, \&quot;Bob\&quot;);
     * SELECT * FROM t;</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <strong>example:</strong>
     * <p>{
     *  &quot;OSSURL&quot;: &quot;oss://testBucketname/&quot;
     * }</p>
     */
    @NameInMap("RuntimeConfig")
    public String runtimeConfig;

    /**
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static ExecuteSparkWarehouseBatchSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkWarehouseBatchSQLRequest self = new ExecuteSparkWarehouseBatchSQLRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkWarehouseBatchSQLRequest setAgency(String agency) {
        this.agency = agency;
        return this;
    }
    public String getAgency() {
        return this.agency;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setExecuteResultLimit(Long executeResultLimit) {
        this.executeResultLimit = executeResultLimit;
        return this;
    }
    public Long getExecuteResultLimit() {
        return this.executeResultLimit;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setExecuteTimeLimitInSeconds(Long executeTimeLimitInSeconds) {
        this.executeTimeLimitInSeconds = executeTimeLimitInSeconds;
        return this;
    }
    public Long getExecuteTimeLimitInSeconds() {
        return this.executeTimeLimitInSeconds;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setRuntimeConfig(String runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public String getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public ExecuteSparkWarehouseBatchSQLRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
