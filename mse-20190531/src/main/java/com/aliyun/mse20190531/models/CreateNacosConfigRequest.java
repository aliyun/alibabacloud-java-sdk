// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Type")
    public String type;

    @NameInMap("Content")
    public String content;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("BetaIps")
    public String betaIps;

    public static CreateNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosConfigRequest self = new CreateNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateNacosConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateNacosConfigRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateNacosConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateNacosConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNacosConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosConfigRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

}
