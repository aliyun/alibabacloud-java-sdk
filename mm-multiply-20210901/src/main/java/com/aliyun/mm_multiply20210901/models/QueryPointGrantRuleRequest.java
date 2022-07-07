// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryPointGrantRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static QueryPointGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPointGrantRuleRequest self = new QueryPointGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryPointGrantRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryPointGrantRuleRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public QueryPointGrantRuleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
