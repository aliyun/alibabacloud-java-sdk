// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRoutinesRequest extends TeaModel {
    /**
     * <p>The page number of the returned page. Default value: 1. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>ListUserRoutines</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The keyword used for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    public static ListUserRoutinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRoutinesRequest self = new ListUserRoutinesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRoutinesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRoutinesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUserRoutinesRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

}
