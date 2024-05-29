// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
     */
    @NameInMap("BetaIps")
    public String betaIps;

    /**
     * <p>The content of the configuration.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the configuration.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The description of the configuration.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The encryption key.</p>
     */
    @NameInMap("EncryptedDataKey")
    public String encryptedDataKey;

    /**
     * <p>The name of the group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The MD5 value of the configuration.</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.</p>
     */
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
