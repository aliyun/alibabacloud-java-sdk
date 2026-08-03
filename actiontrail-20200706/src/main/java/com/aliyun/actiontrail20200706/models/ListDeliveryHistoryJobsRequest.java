// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <ul>
     * <li><p>The value must be greater than or equal to 1.</p>
     * </li>
     * <li><p>Default value: 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Valid values: 1 to 100.</p>
     * </li>
     * <li><p>Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
