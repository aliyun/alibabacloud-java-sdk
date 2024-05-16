// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddToMetaCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The GUID of the metatable.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
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
