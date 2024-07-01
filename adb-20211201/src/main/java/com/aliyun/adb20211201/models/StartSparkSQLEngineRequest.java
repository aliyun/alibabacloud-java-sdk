// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkSQLEngineRequest extends TeaModel {
    /**
     * <p>The configuration that is required to start the Spark SQL engine. Specify this value in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/471203.html">Conf configuration parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;spark.shuffle.timeout&quot;: &quot;:0s&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-abcd****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The Object Storage Service (OSS) paths of third-party JAR packages that are required to start the Spark SQL engine. Separate multiple OSS paths with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>oss://testBuckname/test.jar,oss://testBuckname/test2.jar</p>
     */
    @NameInMap("Jars")
    public String jars;

    /**
     * <p>The maximum number of executors that are required to execute SQL statements. Valid values: 1 to 2000. If this value exceeds the total number of executes that are supported by the resource group, the Spark SQL engine fails to be started.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxExecutor")
    public Long maxExecutor;

    /**
     * <p>The minimum number of executors that are required to execute SQL statements. Valid values: 0 to 2000. A value of 0 indicates that no executors are permanent if no SQL statements are executed. If this value exceeds the total number of executors that are supported by the resource group, the Spark SQL engine fails to be started. The value must be less than the value of MaxExecutor.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinExecutor")
    public Long minExecutor;

    /**
     * <p>The name of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spark-rg-name</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The maximum number of slots that are required to maintain Spark sessions for executing SQL statements. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SlotNum")
    public Long slotNum;

    public static StartSparkSQLEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSparkSQLEngineRequest self = new StartSparkSQLEngineRequest();
        return TeaModel.build(map, self);
    }

    public StartSparkSQLEngineRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StartSparkSQLEngineRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StartSparkSQLEngineRequest setJars(String jars) {
        this.jars = jars;
        return this;
    }
    public String getJars() {
        return this.jars;
    }

    public StartSparkSQLEngineRequest setMaxExecutor(Long maxExecutor) {
        this.maxExecutor = maxExecutor;
        return this;
    }
    public Long getMaxExecutor() {
        return this.maxExecutor;
    }

    public StartSparkSQLEngineRequest setMinExecutor(Long minExecutor) {
        this.minExecutor = minExecutor;
        return this;
    }
    public Long getMinExecutor() {
        return this.minExecutor;
    }

    public StartSparkSQLEngineRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public StartSparkSQLEngineRequest setSlotNum(Long slotNum) {
        this.slotNum = slotNum;
        return this;
    }
    public Long getSlotNum() {
        return this.slotNum;
    }

}
