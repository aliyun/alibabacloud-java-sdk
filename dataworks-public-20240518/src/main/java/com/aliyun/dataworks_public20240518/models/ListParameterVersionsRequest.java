// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParameterVersionsRequest extends TeaModel {
    /**
     * <p>The parameter ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Specifies the page number of the results to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Specifies the number of entries to return per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies the sort criterion in the format \<sort field> \<sort order>. You can omit Asc for ascending order. The only valid value for the sort field is:</p>
     * <ul>
     * <li>Version (Desc/Asc)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Version Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListParameterVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsRequest self = new ListParameterVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListParameterVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListParameterVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListParameterVersionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
