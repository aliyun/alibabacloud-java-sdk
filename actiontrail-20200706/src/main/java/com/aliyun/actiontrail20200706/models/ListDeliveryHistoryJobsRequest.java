// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <br>
     * <p>*   Pages start from page 1.</p>
     * <p>*   Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100.</p>
     * <p>*   Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeliveryHistoryJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryHistoryJobsRequest self = new ListDeliveryHistoryJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryHistoryJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeliveryHistoryJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
