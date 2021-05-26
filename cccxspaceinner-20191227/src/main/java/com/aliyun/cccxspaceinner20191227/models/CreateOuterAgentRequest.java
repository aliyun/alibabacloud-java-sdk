// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOuterAgentRequest extends TeaModel {
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

    @NameInMap("MaxServiceNum")
    public Integer maxServiceNum;

    public static CreateOuterAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterAgentRequest self = new CreateOuterAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateOuterAgentRequest setOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }
    public String getOuterType() {
        return this.outerType;
    }

    public CreateOuterAgentRequest setOuterBuId(String outerBuId) {
        this.outerBuId = outerBuId;
        return this;
    }
    public String getOuterBuId() {
        return this.outerBuId;
    }

    public CreateOuterAgentRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public CreateOuterAgentRequest setOuterAccountName(String outerAccountName) {
        this.outerAccountName = outerAccountName;
        return this;
    }
    public String getOuterAccountName() {
        return this.outerAccountName;
    }

    public CreateOuterAgentRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public CreateOuterAgentRequest setMaxServiceNum(Integer maxServiceNum) {
        this.maxServiceNum = maxServiceNum;
        return this;
    }
    public Integer getMaxServiceNum() {
        return this.maxServiceNum;
    }

}
