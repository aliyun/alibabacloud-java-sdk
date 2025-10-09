// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineRelatedRecordsRequest extends TeaModel {
    /**
     * <p>The name of the function.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the returned page. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: an integer from 1 to 20.</p>
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

    public static ListRoutineRelatedRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineRelatedRecordsRequest self = new ListRoutineRelatedRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutineRelatedRecordsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRoutineRelatedRecordsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineRelatedRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoutineRelatedRecordsRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

}
