// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteFlexAccFwdRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Identity")
    public String identity;

    public static DeleteFlexAccFwdRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlexAccFwdRuleRequest self = new DeleteFlexAccFwdRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlexAccFwdRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteFlexAccFwdRuleRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public DeleteFlexAccFwdRuleRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
