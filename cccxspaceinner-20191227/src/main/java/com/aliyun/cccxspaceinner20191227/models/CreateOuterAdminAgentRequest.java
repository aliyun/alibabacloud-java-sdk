// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOuterAdminAgentRequest extends TeaModel {
    @NameInMap("OuterType")
    public String outerType;

    @NameInMap("OuterBuId")
    public String outerBuId;

    @NameInMap("OuterAccountId")
    public String outerAccountId;

    @NameInMap("OuterAccountName")
    public String outerAccountName;

    @NameInMap("ShowName")
    public String showName;

    public static CreateOuterAdminAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterAdminAgentRequest self = new CreateOuterAdminAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateOuterAdminAgentRequest setOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }
    public String getOuterType() {
        return this.outerType;
    }

    public CreateOuterAdminAgentRequest setOuterBuId(String outerBuId) {
        this.outerBuId = outerBuId;
        return this;
    }
    public String getOuterBuId() {
        return this.outerBuId;
    }

    public CreateOuterAdminAgentRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public CreateOuterAdminAgentRequest setOuterAccountName(String outerAccountName) {
        this.outerAccountName = outerAccountName;
        return this;
    }
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    public CreateOuterAdminAgentRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

}
