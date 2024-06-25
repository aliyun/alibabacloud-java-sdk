// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckControlPlaneLogEnableResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>162981*****</p>
     */
    @NameInMap("aliuid")
    public String aliuid;

    /**
     * <p>The control plane components for which log collection is enabled.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("components")
    public java.util.List<String> components;

    /**
     * <p>The name of the Simple Log Service project that you want to use to store the logs of control plane components.</p>
     * <p>Default value: k8s-log-$Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
     */
    @NameInMap("log_project")
    public String logProject;

    /**
     * <p>The retention period of the log data stored in the Logstore. Valid values: 1 to 3000. Unit: days.</p>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("log_ttl")
    public String logTtl;

    public static CheckControlPlaneLogEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckControlPlaneLogEnableResponseBody self = new CheckControlPlaneLogEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckControlPlaneLogEnableResponseBody setAliuid(String aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public String getAliuid() {
        return this.aliuid;
    }

    public CheckControlPlaneLogEnableResponseBody setComponents(java.util.List<String> components) {
        this.components = components;
        return this;
    }
    public java.util.List<String> getComponents() {
        return this.components;
    }

    public CheckControlPlaneLogEnableResponseBody setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public CheckControlPlaneLogEnableResponseBody setLogTtl(String logTtl) {
        this.logTtl = logTtl;
        return this;
    }
    public String getLogTtl() {
        return this.logTtl;
    }

}
