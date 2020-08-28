// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitRequest extends TeaModel {
    @NameInMap("OwnerUid")
    @Validation(required = true)
    public Long ownerUid;

    @NameInMap("ParentUnitId")
    @Validation(required = true)
    public Long parentUnitId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitRequest self = new QueryCostUnitRequest();
        return TeaModel.build(map, self);
    }

}
