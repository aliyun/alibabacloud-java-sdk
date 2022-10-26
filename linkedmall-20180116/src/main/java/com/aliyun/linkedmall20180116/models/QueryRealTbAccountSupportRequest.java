// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRealTbAccountSupportRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryRealTbAccountSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRealTbAccountSupportRequest self = new QueryRealTbAccountSupportRequest();
        return TeaModel.build(map, self);
    }

    public QueryRealTbAccountSupportRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
