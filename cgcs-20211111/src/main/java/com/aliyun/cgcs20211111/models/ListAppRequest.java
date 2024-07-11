// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("KeySearch")
    public String keySearch;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppRequest self = new ListAppRequest();
        return TeaModel.build(map, self);
    }

    public ListAppRequest setKeySearch(String keySearch) {
        this.keySearch = keySearch;
        return this;
    }
    public String getKeySearch() {
        return this.keySearch;
    }

    public ListAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
