// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BetaIps")
    public String betaIps;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("Desc")
    public String desc;

    @NameInMap("EncryptedDataKey")
    public String encryptedDataKey;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>system error</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>systemError</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>clusterNotFound</p>
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
