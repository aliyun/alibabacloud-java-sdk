// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexFwdRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("MasterIpList")
    public String masterIpList;

    @NameInMap("SlaveIpList")
    public String slaveIpList;

    @NameInMap("Remark")
    public String remark;

    public static CreateFlexFwdRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexFwdRuleRequest self = new CreateFlexFwdRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlexFwdRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateFlexFwdRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateFlexFwdRuleRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateFlexFwdRuleRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateFlexFwdRuleRequest setMasterIpList(String masterIpList) {
        this.masterIpList = masterIpList;
        return this;
    }
    public String getMasterIpList() {
        return this.masterIpList;
    }

    public CreateFlexFwdRuleRequest setSlaveIpList(String slaveIpList) {
        this.slaveIpList = slaveIpList;
        return this;
    }
    public String getSlaveIpList() {
        return this.slaveIpList;
    }

    public CreateFlexFwdRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
