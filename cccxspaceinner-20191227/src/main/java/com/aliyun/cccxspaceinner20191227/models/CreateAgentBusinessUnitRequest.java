// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateAgentBusinessUnitRequest extends TeaModel {
    @NameInMap("OuterType")
    public String outerType;

    @NameInMap("OuterBuId")
    public String outerBuId;

    @NameInMap("BuName")
    public String buName;

    @NameInMap("OuterAdminAccountId")
    public String outerAdminAccountId;

    @NameInMap("OuterAdminAccountName")
    public String outerAdminAccountName;

    public static CreateAgentBusinessUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentBusinessUnitRequest self = new CreateAgentBusinessUnitRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentBusinessUnitRequest setOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }
    public String getOuterType() {
        return this.outerType;
    }

    public CreateAgentBusinessUnitRequest setOuterBuId(String outerBuId) {
        this.outerBuId = outerBuId;
        return this;
    }
    public String getOuterBuId() {
        return this.outerBuId;
    }

    public CreateAgentBusinessUnitRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public CreateAgentBusinessUnitRequest setOuterAdminAccountId(String outerAdminAccountId) {
        this.outerAdminAccountId = outerAdminAccountId;
        return this;
    }
    public String getOuterAdminAccountId() {
        return this.outerAdminAccountId;
    }

    public CreateAgentBusinessUnitRequest setOuterAdminAccountName(String outerAdminAccountName) {
        this.outerAdminAccountName = outerAdminAccountName;
        return this;
    }
    public String getOuterAdminAccountName() {
        return this.outerAdminAccountName;
    }

}
