// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfig extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ConfigFileName")
    public String configFileName;

    @NameInMap("ConfigItemKey")
    public String configItemKey;

    @NameInMap("ConfigItemValue")
    public String configItemValue;

    @NameInMap("ConfigScope")
    public String configScope;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

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
