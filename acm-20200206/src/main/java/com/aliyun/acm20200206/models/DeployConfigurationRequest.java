// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeployConfigurationRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Group")
    public String group;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Content")
    public String content;

    @NameInMap("Type")
    public String type;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("BetaIps")
    public String betaIps;

    public static DeployConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployConfigurationRequest self = new DeployConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeployConfigurationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeployConfigurationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeployConfigurationRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DeployConfigurationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeployConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DeployConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeployConfigurationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeployConfigurationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeployConfigurationRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

}
