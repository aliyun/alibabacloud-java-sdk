// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeployConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("BetaIps")
    public String betaIps;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyun.acm.example</p>
     */
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Desc")
    public String desc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111000d2-ca66-42ba-b706-****</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeployConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployConfigurationRequest self = new DeployConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeployConfigurationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeployConfigurationRequest setBetaIps(String betaIps) {
        this.betaIps = betaIps;
        return this;
    }
    public String getBetaIps() {
        return this.betaIps;
    }

    public DeployConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeployConfigurationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeployConfigurationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeployConfigurationRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DeployConfigurationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeployConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DeployConfigurationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
