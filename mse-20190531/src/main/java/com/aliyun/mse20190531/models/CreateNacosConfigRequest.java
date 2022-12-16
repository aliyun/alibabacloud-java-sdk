// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // - zh: Chinese
    // - en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The name of the application.
    @NameInMap("AppName")
    public String appName;

    // The list of IP addresses where the beta release of the configuration is performed.
    @NameInMap("BetaIps")
    public String betaIps;

    // The content of the configuration.
    @NameInMap("Content")
    public String content;

    // The data ID.
    @NameInMap("DataId")
    public String dataId;

    // The description of the configuration.
    @NameInMap("Desc")
    public String desc;

    // The ID of the group.
    @NameInMap("Group")
    public String group;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The tag of the configuration.
    @NameInMap("Tags")
    public String tags;

    // The format of the configuration. Supported formats include TEXT, JSON, and XML.
    @NameInMap("Type")
    public String type;

    public static CreateNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosConfigRequest self = new CreateNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNacosConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateNacosConfigRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

    public CreateNacosConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateNacosConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosConfigRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateNacosConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
