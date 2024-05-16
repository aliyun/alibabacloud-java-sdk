// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaTableListByCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryRequest self = new GetMetaTableListByCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableListByCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public GetMetaTableListByCategoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaTableListByCategoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
