// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CleanFlexAccFwdRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    public static CleanFlexAccFwdRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanFlexAccFwdRulesRequest self = new CleanFlexAccFwdRulesRequest();
        return TeaModel.build(map, self);
    }

    public CleanFlexAccFwdRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CleanFlexAccFwdRulesRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

}
