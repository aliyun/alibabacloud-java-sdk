// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeploymentLayout extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("NodeSelector")
    public NodeSelector nodeSelector;

    public static DeploymentLayout build(java.util.Map<String, ?> map) throws Exception {
        DeploymentLayout self = new DeploymentLayout();
        return TeaModel.build(map, self);
    }

    public DeploymentLayout setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DeploymentLayout setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public DeploymentLayout setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

}
