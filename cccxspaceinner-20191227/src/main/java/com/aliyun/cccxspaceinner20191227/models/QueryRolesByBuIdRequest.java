// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryRolesByBuIdRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    public static QueryRolesByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRolesByBuIdRequest self = new QueryRolesByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryRolesByBuIdRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

}
