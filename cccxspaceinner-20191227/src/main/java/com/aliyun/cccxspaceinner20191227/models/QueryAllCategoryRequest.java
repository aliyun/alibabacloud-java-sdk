// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAllCategoryRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("RealTime")
    public Boolean realTime;

    public static QueryAllCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCategoryRequest self = new QueryAllCategoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllCategoryRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public QueryAllCategoryRequest setRealTime(Boolean realTime) {
        this.realTime = realTime;
        return this;
    }
    public Boolean getRealTime() {
        return this.realTime;
    }

}
