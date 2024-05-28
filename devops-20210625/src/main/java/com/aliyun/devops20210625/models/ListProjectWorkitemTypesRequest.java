// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectWorkitemTypesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceType")
    public String spaceType;

    public static ListProjectWorkitemTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectWorkitemTypesRequest self = new ListProjectWorkitemTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectWorkitemTypesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListProjectWorkitemTypesRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
