// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ChaincodeVO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a5f04baed775b016e8dc386783f40a2c8b13823cac22bc5fd11846cca4a13a9a</p>
     */
    @NameInMap("ChaincodeDefinitionId")
    public String chaincodeDefinitionId;

    /**
     * <strong>example:</strong>
     * <p>code-sacc-jbkuldd3i7ad</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <strong>example:</strong>
     * <p>sacc_v1.0:698d4e73c5f1d0239fbf0313ac79ddfaf44d5a803ecb02a4d1983cca4a706860</p>
     */
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    /**
     * <strong>example:</strong>
     * <p>chan-test-b0wx5suhgyb9p</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>f100</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>1533025590</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1533025590</p>
     */
    @NameInMap("DeployTime")
    public String deployTime;

    /**
     * <strong>example:</strong>
     * <p>OR (&quot;perf9141MSP.member&quot;)</p>
     */
    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InitRequired")
    public Boolean initRequired;

    /**
     * <strong>example:</strong>
     * <p>args:&quot;key&quot; args:&quot;val&quot;</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Install")
    public Boolean install;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Management")
    public Boolean management;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>sacc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>chaincode/sacc</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    /**
     * <strong>example:</strong>
     * <p>perf9141</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
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
