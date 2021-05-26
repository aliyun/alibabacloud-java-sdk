// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupByBuIdRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    public static QueryAgentGroupByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupByBuIdRequest self = new QueryAgentGroupByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupByBuIdRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

}
