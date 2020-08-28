// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceRequest extends TeaModel {
    @NameInMap("OwnerUid")
    @Validation(required = true)
    public Long ownerUid;

    @NameInMap("UnitId")
    @Validation(required = true)
    public Long unitId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCostUnitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResourceRequest self = new QueryCostUnitResourceRequest();
        return TeaModel.build(map, self);
    }

}
