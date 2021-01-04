// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexAccFwdRuleListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("FwdRuleList")
    public String fwdRuleList;

    public static CreateFlexAccFwdRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexAccFwdRuleListRequest self = new CreateFlexAccFwdRuleListRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlexAccFwdRuleListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateFlexAccFwdRuleListRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateFlexAccFwdRuleListRequest setFwdRuleList(String fwdRuleList) {
        this.fwdRuleList = fwdRuleList;
        return this;
    }
    public String getFwdRuleList() {
        return this.fwdRuleList;
    }

}
