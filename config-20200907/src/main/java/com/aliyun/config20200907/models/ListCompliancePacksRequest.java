// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the compliance package to be queried. Valid values:</p>
     * <br>
     * <p>*   ACTIVE: The compliance package is active.</p>
     * <p>*   CREATING: The compliance package is being created.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePacksRequest self = new ListCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public ListCompliancePacksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCompliancePacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompliancePacksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
