// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckControlPlaneLogEnableResponseBody extends TeaModel {
    @NameInMap("aliuid")
    public String aliuid;

    @NameInMap("components")
    public java.util.List<String> components;

    @NameInMap("log_project")
    public String logProject;

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
