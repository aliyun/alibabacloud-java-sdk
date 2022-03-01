// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ChaincodeVO extends TeaModel {
    // 链码定义ID
    @NameInMap("ChaincodeDefinitionId")
    public String chaincodeDefinitionId;

    // 链码ID
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    // 链码包ID
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    // 通道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 通道名称
    @NameInMap("ChannelName")
    public String channelName;

    // 联盟ID
    @NameInMap("ConsortiumId")
    public String consortiumId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 安装部署时间
    @NameInMap("DeployTime")
    public String deployTime;

    // 背书策略
    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    // 是否需要初始化
    @NameInMap("InitRequired")
    public Boolean initRequired;

    // 链码初始化参数
    @NameInMap("Input")
    public String input;

    // 链码是否安装
    @NameInMap("Install")
    public Boolean install;

    // 是否是管理链码
    @NameInMap("Management")
    public Boolean management;

    // 信息
    @NameInMap("Message")
    public String message;

    // 链码包名称
    @NameInMap("Name")
    public String name;

    // 链码路径
    @NameInMap("Path")
    public String path;

    // 上传者ID
    @NameInMap("ProviderId")
    public String providerId;

    // 链码上传者
    @NameInMap("ProviderName")
    public String providerName;

    // 链码状态
    @NameInMap("State")
    public String state;

    // 链码类型
    @NameInMap("Type")
    public Integer type;

    // 链码包版本
    @NameInMap("Version")
    public String version;

    public static ChaincodeVO build(java.util.Map<String, ?> map) throws Exception {
        ChaincodeVO self = new ChaincodeVO();
        return TeaModel.build(map, self);
    }

    public ChaincodeVO setChaincodeDefinitionId(String chaincodeDefinitionId) {
        this.chaincodeDefinitionId = chaincodeDefinitionId;
        return this;
    }
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    public ChaincodeVO setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public ChaincodeVO setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public ChaincodeVO setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ChaincodeVO setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChaincodeVO setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ChaincodeVO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ChaincodeVO setDeployTime(String deployTime) {
        this.deployTime = deployTime;
        return this;
    }
    public String getDeployTime() {
        return this.deployTime;
    }

    public ChaincodeVO setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public ChaincodeVO setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public ChaincodeVO setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ChaincodeVO setInstall(Boolean install) {
        this.install = install;
        return this;
    }
    public Boolean getInstall() {
        return this.install;
    }

    public ChaincodeVO setManagement(Boolean management) {
        this.management = management;
        return this;
    }
    public Boolean getManagement() {
        return this.management;
    }

    public ChaincodeVO setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChaincodeVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChaincodeVO setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ChaincodeVO setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public ChaincodeVO setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public ChaincodeVO setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ChaincodeVO setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ChaincodeVO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
