// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccFwdRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("ProtocolEx")
    public String protocolEx;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("Remark")
    public String remark;

    public static UpdateFlexAccFwdRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccFwdRuleRequest self = new UpdateFlexAccFwdRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccFwdRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexAccFwdRuleRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexAccFwdRuleRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public UpdateFlexAccFwdRuleRequest setProtocolEx(String protocolEx) {
        this.protocolEx = protocolEx;
        return this;
    }
    public String getProtocolEx() {
        return this.protocolEx;
    }

    public UpdateFlexAccFwdRuleRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public UpdateFlexAccFwdRuleRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public UpdateFlexAccFwdRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
