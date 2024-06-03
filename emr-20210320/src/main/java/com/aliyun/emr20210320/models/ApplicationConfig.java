// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfig extends TeaModel {
    /**
     * <p>应用名称。从EMR控制台集群创建页面可查看到指定发行版的应用名称列表。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>应用配置文件名。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>配置项键。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>配置项值。</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    /**
     * <p>配置范围。取值范围：</p>
     * <p>- CLUSTER：集群级别。</p>
     * <p>- NODE_GROUP：节点组级别。</p>
     * <br>
     * <p>默认值：CLUSTER。</p>
     */
    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <p>节点组ID。ConfigScope取值NODE_GROUP时，该参数生效。NodeGroupId参数优先级高于NodeGroupName。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点组名称。ConfigScope取值NODE_GROUP时，且参数NodeGroupId为空时生效，该参数生效。</p>
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
