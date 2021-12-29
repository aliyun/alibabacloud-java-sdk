// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddRouteRuleRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("ContractName")
    public String contractName;

    @NameInMap("ContractTemplateId")
    public String contractTemplateId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    @NameInMap("Remark")
    public String remark;

    public static AddRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRouteRuleRequest self = new AddRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddRouteRuleRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public AddRouteRuleRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public AddRouteRuleRequest setContractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
        return this;
    }
    public String getContractTemplateId() {
        return this.contractTemplateId;
    }

    public AddRouteRuleRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public AddRouteRuleRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public AddRouteRuleRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    public AddRouteRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
