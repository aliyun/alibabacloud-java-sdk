// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBaaSAntChainBizChainRequest extends TeaModel {
    @NameInMap("BaaSAntChainChainId")
    public String baaSAntChainChainId;

    @NameInMap("BaaSAntChainConsortiumId")
    public String baaSAntChainConsortiumId;

    @NameInMap("CaCert")
    public String caCert;

    @NameInMap("CaCertPassword")
    public String caCertPassword;

    @NameInMap("ClientCert")
    public String clientCert;

    @NameInMap("ClientKey")
    public String clientKey;

    @NameInMap("ClientKeyPassword")
    public String clientKeyPassword;

    @NameInMap("ContractTemplateIdList")
    public String contractTemplateIdList;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeNameList")
    public String nodeNameList;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UserKey")
    public String userKey;

    @NameInMap("UserKeyPassword")
    public String userKeyPassword;

    @NameInMap("UserName")
    public String userName;

    public static AddBaaSAntChainBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaaSAntChainBizChainRequest self = new AddBaaSAntChainBizChainRequest();
        return TeaModel.build(map, self);
    }

    public AddBaaSAntChainBizChainRequest setBaaSAntChainChainId(String baaSAntChainChainId) {
        this.baaSAntChainChainId = baaSAntChainChainId;
        return this;
    }
    public String getBaaSAntChainChainId() {
        return this.baaSAntChainChainId;
    }

    public AddBaaSAntChainBizChainRequest setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
        this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
        return this;
    }
    public String getBaaSAntChainConsortiumId() {
        return this.baaSAntChainConsortiumId;
    }

    public AddBaaSAntChainBizChainRequest setCaCert(String caCert) {
        this.caCert = caCert;
        return this;
    }
    public String getCaCert() {
        return this.caCert;
    }

    public AddBaaSAntChainBizChainRequest setCaCertPassword(String caCertPassword) {
        this.caCertPassword = caCertPassword;
        return this;
    }
    public String getCaCertPassword() {
        return this.caCertPassword;
    }

    public AddBaaSAntChainBizChainRequest setClientCert(String clientCert) {
        this.clientCert = clientCert;
        return this;
    }
    public String getClientCert() {
        return this.clientCert;
    }

    public AddBaaSAntChainBizChainRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public AddBaaSAntChainBizChainRequest setClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    public String getClientKeyPassword() {
        return this.clientKeyPassword;
    }

    public AddBaaSAntChainBizChainRequest setContractTemplateIdList(String contractTemplateIdList) {
        this.contractTemplateIdList = contractTemplateIdList;
        return this;
    }
    public String getContractTemplateIdList() {
        return this.contractTemplateIdList;
    }

    public AddBaaSAntChainBizChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddBaaSAntChainBizChainRequest setNodeNameList(String nodeNameList) {
        this.nodeNameList = nodeNameList;
        return this;
    }
    public String getNodeNameList() {
        return this.nodeNameList;
    }

    public AddBaaSAntChainBizChainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddBaaSAntChainBizChainRequest setUserKey(String userKey) {
        this.userKey = userKey;
        return this;
    }
    public String getUserKey() {
        return this.userKey;
    }

    public AddBaaSAntChainBizChainRequest setUserKeyPassword(String userKeyPassword) {
        this.userKeyPassword = userKeyPassword;
        return this;
    }
    public String getUserKeyPassword() {
        return this.userKeyPassword;
    }

    public AddBaaSAntChainBizChainRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
