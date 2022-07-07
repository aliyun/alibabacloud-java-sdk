// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetPointCommonRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static GetPointCommonRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPointCommonRuleRequest self = new GetPointCommonRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetPointCommonRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
