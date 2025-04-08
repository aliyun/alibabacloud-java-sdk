// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRoutinesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ListUserRoutines</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

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
