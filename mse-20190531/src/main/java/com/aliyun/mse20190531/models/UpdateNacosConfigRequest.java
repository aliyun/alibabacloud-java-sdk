// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
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

    // The ID of the configuration.
    @NameInMap("DataId")
    public String dataId;

    // The description of the configuration.
    @NameInMap("Desc")
    public String desc;

    // The encryption key.
    @NameInMap("EncryptedDataKey")
    public String encryptedDataKey;

    // The group.
    @NameInMap("Group")
    public String group;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The MD5 value of the configuration.
    @NameInMap("Md5")
    public String md5;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The list of tags.
    @NameInMap("Tags")
    public String tags;

    // The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.
    @NameInMap("Type")
    public String type;

    public static UpdateNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosConfigRequest self = new UpdateNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateNacosConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateNacosConfigRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

    public UpdateNacosConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateNacosConfigRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateNacosConfigRequest setEncryptedDataKey(String encryptedDataKey) {
        this.encryptedDataKey = encryptedDataKey;
        return this;
    }
    public String getEncryptedDataKey() {
        return this.encryptedDataKey;
    }

    public UpdateNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosConfigRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UpdateNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosConfigRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateNacosConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
