// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListServerGroupsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Sorter")
    public String sorter;

    @NameInMap("Tid")
    public Long tid;

    public static ListServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsRequest self = new ListServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServerGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServerGroupsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListServerGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerGroupsRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public ListServerGroupsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
