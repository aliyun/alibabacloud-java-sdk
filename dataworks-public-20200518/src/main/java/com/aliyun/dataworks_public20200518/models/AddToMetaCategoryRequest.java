// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddToMetaCategoryRequest extends TeaModel {
    @NameInMap("CategoryId")
    @Validation(required = true)
    public Long categoryId;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    public static AddToMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddToMetaCategoryRequest self = new AddToMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddToMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public AddToMetaCategoryRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
