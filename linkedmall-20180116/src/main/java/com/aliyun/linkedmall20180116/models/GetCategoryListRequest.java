// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryListRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("CategoryId")
    public Long categoryId;

    public static GetCategoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListRequest self = new GetCategoryListRequest();
        return TeaModel.build(map, self);
    }

    public GetCategoryListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetCategoryListRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
