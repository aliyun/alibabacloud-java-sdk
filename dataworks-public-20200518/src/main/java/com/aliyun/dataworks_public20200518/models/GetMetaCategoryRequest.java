// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryRequest extends TeaModel {
    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryRequest self = new GetMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

}
