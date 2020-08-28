// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListRequest extends TeaModel {
    @NameInMap("QueryTotalCount")
    public Boolean queryTotalCount;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListRequest self = new QueryProductListRequest();
        return TeaModel.build(map, self);
    }

}
