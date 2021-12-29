// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBaaSFabricBizChainRequest extends TeaModel {
    @NameInMap("BaaSFabricChannelId")
    public String baaSFabricChannelId;

    @NameInMap("BaaSFabricConsortiumId")
    public String baaSFabricConsortiumId;

    @NameInMap("BaaSFabricOrganizationId")
    public String baaSFabricOrganizationId;

    @NameInMap("ContractTemplateIdList")
    public String contractTemplateIdList;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static AddBaaSFabricBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaaSFabricBizChainRequest self = new AddBaaSFabricBizChainRequest();
        return TeaModel.build(map, self);
    }

    public AddBaaSFabricBizChainRequest setBaaSFabricChannelId(String baaSFabricChannelId) {
        this.baaSFabricChannelId = baaSFabricChannelId;
        return this;
    }
    public String getBaaSFabricChannelId() {
        return this.baaSFabricChannelId;
    }

    public AddBaaSFabricBizChainRequest setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
        this.baaSFabricConsortiumId = baaSFabricConsortiumId;
        return this;
    }
    public String getBaaSFabricConsortiumId() {
        return this.baaSFabricConsortiumId;
    }

    public AddBaaSFabricBizChainRequest setBaaSFabricOrganizationId(String baaSFabricOrganizationId) {
        this.baaSFabricOrganizationId = baaSFabricOrganizationId;
        return this;
    }
    public String getBaaSFabricOrganizationId() {
        return this.baaSFabricOrganizationId;
    }

    public AddBaaSFabricBizChainRequest setContractTemplateIdList(String contractTemplateIdList) {
        this.contractTemplateIdList = contractTemplateIdList;
        return this;
    }
    public String getContractTemplateIdList() {
        return this.contractTemplateIdList;
    }

    public AddBaaSFabricBizChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddBaaSFabricBizChainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
