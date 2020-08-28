// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    public static UpdateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryRequest self = new UpdateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

}
