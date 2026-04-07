// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVariableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-zop7ukgtksltamo4</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

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

    /**
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVariableRequest self = new ListVariableRequest();
        return TeaModel.build(map, self);
    }

    public ListVariableRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public ListVariableRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVariableRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVariableRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
