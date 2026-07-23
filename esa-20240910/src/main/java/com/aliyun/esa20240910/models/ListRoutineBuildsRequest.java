// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildsRequest extends TeaModel {
    /**
     * <p>The page number for a paged query. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page for a paged query. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ER name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    /**
     * <p>The field used for sorting. By default, results are sorted by purchase time. Valid values:</p>
     * <ul>
     * <li>CreateTime: purchase time.</li>
     * <li>ExpireTime: expiration time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Default value: desc. Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The status of the build task. Valid values:</p>
     * <ul>
     * <li>int: initialization</li>
     * <li>pending: preparing</li>
     * <li>building: building</li>
     * <li>succeed: build succeeded</li>
     * <li>failed: build failed</li>
     * <li>canceled: canceled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>canceled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListRoutineBuildsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildsRequest self = new ListRoutineBuildsRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListRoutineBuildsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRoutineBuildsRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public ListRoutineBuildsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListRoutineBuildsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListRoutineBuildsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
