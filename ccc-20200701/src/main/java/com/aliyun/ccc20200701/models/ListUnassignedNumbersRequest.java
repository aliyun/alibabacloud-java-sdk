// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUnassignedNumbersRequest extends TeaModel {
    /**
     * <p>Page number for paging, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs Fuzzy Matching based on the number. This parameter is optional and defaults to empty. An empty value indicates no filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>0833</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListUnassignedNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnassignedNumbersRequest self = new ListUnassignedNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ListUnassignedNumbersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUnassignedNumbersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUnassignedNumbersRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
