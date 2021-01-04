// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexAccFwdRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("ProtocolEx")
    public String protocolEx;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("MasterIpList")
    public String masterIpList;

    @NameInMap("SlaveIpList")
    public String slaveIpList;

    @NameInMap("AccType")
    public Integer accType;

    public static CreateFlexAccFwdRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexAccFwdRuleRequest self = new CreateFlexAccFwdRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlexAccFwdRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateFlexAccFwdRuleRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateFlexAccFwdRuleRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateFlexAccFwdRuleRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public CreateFlexAccFwdRuleRequest setProtocolEx(String protocolEx) {
        this.protocolEx = protocolEx;
        return this;
    }
    public String getProtocolEx() {
        return this.protocolEx;
    }

    public CreateFlexAccFwdRuleRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public CreateFlexAccFwdRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFlexAccFwdRuleRequest setMasterIpList(String masterIpList) {
        this.masterIpList = masterIpList;
        return this;
    }
    public String getMasterIpList() {
        return this.masterIpList;
    }

    public CreateFlexAccFwdRuleRequest setSlaveIpList(String slaveIpList) {
        this.slaveIpList = slaveIpList;
        return this;
    }
    public String getSlaveIpList() {
        return this.slaveIpList;
    }

    public CreateFlexAccFwdRuleRequest setAccType(Integer accType) {
        this.accType = accType;
        return this;
    }
    public Integer getAccType() {
        return this.accType;
    }

}
