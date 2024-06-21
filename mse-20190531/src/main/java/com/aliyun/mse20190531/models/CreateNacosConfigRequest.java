// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>saledatacenter-task</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>100.117.XX.XX,100.117.XX.XX</p>
     */
    @NameInMap("BetaIps")
    public String betaIps;

    /**
     * <p>The content of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common.yaml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The description of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic module configuration.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alime-bridge-aliyun</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-tl32****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>547fd2a0-d0d6-****-80db2a1afb82</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The tags of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic configurations</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The format of the configuration. Supported formats include TEXT, JSON, and XML.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
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
