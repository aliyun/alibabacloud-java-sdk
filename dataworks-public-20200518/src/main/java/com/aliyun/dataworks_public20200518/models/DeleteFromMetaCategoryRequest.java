// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteFromMetaCategoryRequest extends TeaModel {
    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    public static DeleteFromMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFromMetaCategoryRequest self = new DeleteFromMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

}
