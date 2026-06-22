// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfig extends TeaModel {
    /**
     * <p>The name of the application. You can view the application names of each EMR version on the cluster creation page in the EMR console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The name of the configuration file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs-site.xml</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>The key of the configuration item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs.namenode.checkpoint.period</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>3600s</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    /**
     * <p>The level at which you want to apply the configurations. Valid values:</p>
     * <ul>
     * <li>CLUSTER</li>
     * <li>NODE_GROUP</li>
     * </ul>
     * <p>Default value: CLUSTER.</p>
     * 
     * <strong>example:</strong>
     * <p>NODE_GROUP</p>
     */
    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <p>The node group ID. This parameter takes effect only when the ConfigScope parameter is set to NODE_GROUP. The NodeGroupId parameter has a higher priority than the NodeGroupName parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The name of the node group. This parameter takes effect only when the ConfigScope parameter is set to NODE_GROUP and the NodeGroupId parameter is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    public static ApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
        ApplicationConfig self = new ApplicationConfig();
        return TeaModel.build(map, self);
    }

    public ApplicationConfig setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationConfig setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ApplicationConfig setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ApplicationConfig setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public ApplicationConfig setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public ApplicationConfig setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ApplicationConfig setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

}
