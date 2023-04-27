// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetRuleNumLimitOfSLARequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static GetRuleNumLimitOfSLARequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleNumLimitOfSLARequest self = new GetRuleNumLimitOfSLARequest();
        return TeaModel.build(map, self);
    }

    public GetRuleNumLimitOfSLARequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public GetRuleNumLimitOfSLARequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
