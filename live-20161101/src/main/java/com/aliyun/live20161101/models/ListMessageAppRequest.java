// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageAppRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1. Valid values: 1 to 100000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of applications to return on each page. Default value: 20. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>0: ascending order by time</li>
     * <li>1: descending order by time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    public static ListMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAppRequest self = new ListMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageAppRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMessageAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessageAppRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

}
