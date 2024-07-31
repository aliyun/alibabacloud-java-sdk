// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can call the <a href="https://help.aliyun.com/document_detail/2780099.html">GetMetaCategory</a> operation to obtain the ID of the category. Categories allow you to efficiently organize and manage tables by category. You can search for the desired table by category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
