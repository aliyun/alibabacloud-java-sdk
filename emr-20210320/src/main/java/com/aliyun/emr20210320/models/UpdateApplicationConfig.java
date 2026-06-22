// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfig extends TeaModel {
    /**
     * <p>A description of the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs.namenode.checkpoint.period</p>
     */
    @NameInMap("ConfigDescription")
    public String configDescription;

    /**
     * <p>The name of the application configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs-site.xml</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>The configuration item key.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs.namenode.checkpoint.period</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>The configuration item value.</p>
     * 
     * <strong>example:</strong>
     * <p>3600s</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    public static UpdateApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfig self = new UpdateApplicationConfig();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfig setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
        return this;
    }
    public String getConfigDescription() {
        return this.configDescription;
    }

    public UpdateApplicationConfig setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public UpdateApplicationConfig setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public UpdateApplicationConfig setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

}
