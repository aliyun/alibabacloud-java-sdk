// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductCategoriesRequest extends TeaModel {
    /**
     * <p>The keyword for the category name. This parameter is used to search for product categories by name.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-capabilities</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The minimum value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListProductCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductCategoriesRequest self = new ListProductCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListProductCategoriesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProductCategoriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductCategoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
