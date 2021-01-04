// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccFwdRuleV2Request extends TeaModel {
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

    public static UpdateFlexAccFwdRuleV2Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccFwdRuleV2Request self = new UpdateFlexAccFwdRuleV2Request();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccFwdRuleV2Request setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexAccFwdRuleV2Request setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UpdateFlexAccFwdRuleV2Request setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public UpdateFlexAccFwdRuleV2Request setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public UpdateFlexAccFwdRuleV2Request setProtocolEx(String protocolEx) {
        this.protocolEx = protocolEx;
        return this;
    }
    public String getProtocolEx() {
        return this.protocolEx;
    }

    public UpdateFlexAccFwdRuleV2Request setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public UpdateFlexAccFwdRuleV2Request setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateFlexAccFwdRuleV2Request setMasterIpList(String masterIpList) {
        this.masterIpList = masterIpList;
        return this;
    }
    public String getMasterIpList() {
        return this.masterIpList;
    }

    public UpdateFlexAccFwdRuleV2Request setSlaveIpList(String slaveIpList) {
        this.slaveIpList = slaveIpList;
        return this;
    }
    public String getSlaveIpList() {
        return this.slaveIpList;
    }

    public UpdateFlexAccFwdRuleV2Request setAccType(Integer accType) {
        this.accType = accType;
        return this;
    }
    public Integer getAccType() {
        return this.accType;
    }

}
