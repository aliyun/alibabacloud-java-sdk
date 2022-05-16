// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class SetCardStopRuleRequest extends TeaModel {
    @NameInMap("AutoRestore")
    public Boolean autoRestore;

    @NameInMap("FlowLimit")
    public Long flowLimit;

    @NameInMap("Iccid")
    public String iccid;

    public static SetCardStopRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCardStopRuleRequest self = new SetCardStopRuleRequest();
        return TeaModel.build(map, self);
    }

    public SetCardStopRuleRequest setAutoRestore(Boolean autoRestore) {
        this.autoRestore = autoRestore;
        return this;
    }
    public Boolean getAutoRestore() {
        return this.autoRestore;
    }

    public SetCardStopRuleRequest setFlowLimit(Long flowLimit) {
        this.flowLimit = flowLimit;
        return this;
    }
    public Long getFlowLimit() {
        return this.flowLimit;
    }

    public SetCardStopRuleRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
