// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobsRequest extends TeaModel {
    /**
     * <p>The page number, starting from 1. If this parameter is not specified or is set to a value less than or equal to 0, page 1 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of job definitions per page. If this parameter is not specified or is set to a value less than or equal to 0, the default value 50 is used. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSemanticJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobsRequest self = new ListSemanticJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSemanticJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
