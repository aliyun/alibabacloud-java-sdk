// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryHBaseHaDBRequest extends TeaModel {
    @NameInMap("BdsId")
    public String bdsId;

    public static QueryHBaseHaDBRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHBaseHaDBRequest self = new QueryHBaseHaDBRequest();
        return TeaModel.build(map, self);
    }

    public QueryHBaseHaDBRequest setBdsId(String bdsId) {
        this.bdsId = bdsId;
        return this;
    }
    public String getBdsId() {
        return this.bdsId;
    }

}
