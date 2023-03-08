// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkSQLEngineRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Jars")
    public String jars;

    @NameInMap("MaxExecutor")
    public Long maxExecutor;

    @NameInMap("MinExecutor")
    public Long minExecutor;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

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
