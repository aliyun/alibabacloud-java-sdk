// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListManagedRulesGroupsRequest extends TeaModel {
    /**
     * <p>Page number, used to specify the page number for pagination queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, used to specify the number of items per page for pagination queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListManagedRulesGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesGroupsRequest self = new ListManagedRulesGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListManagedRulesGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
