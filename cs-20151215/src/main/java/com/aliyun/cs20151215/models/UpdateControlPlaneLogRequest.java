// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogRequest extends TeaModel {
    @NameInMap("aliuid")
    public String aliuid;

    @NameInMap("components")
    public java.util.List<String> components;

    @NameInMap("log_project")
    public String logProject;

    @NameInMap("log_ttl")
    public String logTtl;

    public static UpdateControlPlaneLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogRequest self = new UpdateControlPlaneLogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogRequest setAliuid(String aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public String getAliuid() {
        return this.aliuid;
    }

    public UpdateControlPlaneLogRequest setComponents(java.util.List<String> components) {
        this.components = components;
        return this;
    }
    public java.util.List<String> getComponents() {
        return this.components;
    }

    public UpdateControlPlaneLogRequest setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public UpdateControlPlaneLogRequest setLogTtl(String logTtl) {
        this.logTtl = logTtl;
        return this;
    }
    public String getLogTtl() {
        return this.logTtl;
    }

}
