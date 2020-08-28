// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("ParentId")
    public Long parentId;

    public static CreateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryRequest self = new CreateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

}
