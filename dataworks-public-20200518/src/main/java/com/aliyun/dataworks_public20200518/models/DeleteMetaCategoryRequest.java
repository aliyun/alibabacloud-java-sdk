// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCategoryRequest extends TeaModel {
    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    public static DeleteMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCategoryRequest self = new DeleteMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

}
