// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryBagRemainingRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    public static QueryBagRemainingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBagRemainingRequest self = new QueryBagRemainingRequest();
        return TeaModel.build(map, self);
    }

    public QueryBagRemainingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
