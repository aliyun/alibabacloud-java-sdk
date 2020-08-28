// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    public static GetMetaTableListByCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryRequest self = new GetMetaTableListByCategoryRequest();
        return TeaModel.build(map, self);
    }

}
