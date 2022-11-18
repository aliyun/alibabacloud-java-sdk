// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class InstallGlobalAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstalledAppName")
    public String installedAppName;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("Source")
    public String source;

    @NameInMap("Workspace")
    public String workspace;

    public static InstallGlobalAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallGlobalAppRequest self = new InstallGlobalAppRequest();
        return TeaModel.build(map, self);
    }

    public InstallGlobalAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InstallGlobalAppRequest setInstalledAppName(String installedAppName) {
        this.installedAppName = installedAppName;
        return this;
    }
    public String getInstalledAppName() {
        return this.installedAppName;
    }

    public InstallGlobalAppRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public InstallGlobalAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public InstallGlobalAppRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
