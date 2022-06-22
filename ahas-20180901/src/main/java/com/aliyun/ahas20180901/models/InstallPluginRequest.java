// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InstallPluginRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppGroupName")
    public String appGroupName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static InstallPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPluginRequest self = new InstallPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallPluginRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public InstallPluginRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public InstallPluginRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InstallPluginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstallPluginRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public InstallPluginRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
