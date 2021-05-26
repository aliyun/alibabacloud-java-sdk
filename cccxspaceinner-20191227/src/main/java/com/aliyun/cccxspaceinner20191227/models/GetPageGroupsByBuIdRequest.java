// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByBuIdRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AfterSortKey")
    public Long afterSortKey;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetPageGroupsByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByBuIdRequest self = new GetPageGroupsByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByBuIdRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public GetPageGroupsByBuIdRequest setAfterSortKey(Long afterSortKey) {
        this.afterSortKey = afterSortKey;
        return this;
    }
    public Long getAfterSortKey() {
        return this.afterSortKey;
    }

    public GetPageGroupsByBuIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
