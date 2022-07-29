// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubscriptionAlbumCategoryRequest extends TeaModel {
    @NameInMap("CategoryName")
    public String categoryName;

    public static ListSubscriptionAlbumCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionAlbumCategoryRequest self = new ListSubscriptionAlbumCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionAlbumCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

}
