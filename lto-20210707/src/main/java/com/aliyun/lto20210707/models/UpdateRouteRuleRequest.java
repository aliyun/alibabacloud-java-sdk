// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdateRouteRuleRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("ContractName")
    public String contractName;

    @NameInMap("ContractTemplateId")
    public String contractTemplateId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RouteRuleId")
    public String routeRuleId;

    public static UpdateRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteRuleRequest self = new UpdateRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteRuleRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UpdateRouteRuleRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public UpdateRouteRuleRequest setContractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
        return this;
    }
    public String getContractTemplateId() {
        return this.contractTemplateId;
    }

    public UpdateRouteRuleRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public UpdateRouteRuleRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    public UpdateRouteRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateRouteRuleRequest setRouteRuleId(String routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public String getRouteRuleId() {
        return this.routeRuleId;
    }

}
