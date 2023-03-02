// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the category tree.</p>
     */
    @NameInMap("ParentCategoryId")
    public Long parentCategoryId;

    public static GetMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryRequest self = new GetMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaCategoryRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetMetaCategoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaCategoryRequest setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

}
