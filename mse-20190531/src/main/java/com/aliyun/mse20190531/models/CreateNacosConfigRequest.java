// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigRequest extends TeaModel {
    /**
     * <p>The tags of the configuration.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("BetaIps")
    public String betaIps;

    /**
     * <p>The ID of the data.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the group.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the instance.</p>
     */
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
