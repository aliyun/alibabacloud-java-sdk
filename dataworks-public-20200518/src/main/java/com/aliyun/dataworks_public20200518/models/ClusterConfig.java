// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ClusterConfig extends TeaModel {
    /**
     * <p>The configuration value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;spark.driver.memory&quot;:&quot;1g&quot;}</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>Specifies whether to overwrite the advanced settings of nodes in DataStudio. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableOverwrite")
    public Boolean enableOverwrite;

    /**
     * <p>The module in which the cluster is configured. Valid values:</p>
     * <ul>
     * <li>ide: DataStudio.</li>
     * <li>da: DataAnalysis.</li>
     * <li>scheduler.auto: Operation Center - auto triggered instances.</li>
     * <li>scheduler.backfill: Operation Center - data backfill instances.</li>
     * <li>scheduler.test: Operation Center - test instances.</li>
     * <li>scheduler.manual: Operation Center - manually triggered instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ide</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static ClusterConfig build(java.util.Map<String, ?> map) throws Exception {
        ClusterConfig self = new ClusterConfig();
        return TeaModel.build(map, self);
    }

    public ClusterConfig setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public ClusterConfig setEnableOverwrite(Boolean enableOverwrite) {
        this.enableOverwrite = enableOverwrite;
        return this;
    }
    public Boolean getEnableOverwrite() {
        return this.enableOverwrite;
    }

    public ClusterConfig setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
